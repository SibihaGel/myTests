package org.example;
public class Robot {
    private RobotConnectionManager robotConnectionManager;

    public Robot(RobotConnectionManager robotConnectionManager) {
        this.robotConnectionManager = robotConnectionManager;
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return Direction.UP;
    }

    public int getX() {
        // текущая координата X
        return 0;
    }

    public int getY() {
        // текущая координата Y
        return 0;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public static void moveRobot(Robot robot, int toX, int toY) throws Exception {
        int x = robot.getX();
        int y = robot.getY();
        Direction dir = robot.getDirection();
        if (x < toX) {
            turnTo(robot, Direction.RIGHT);
            while (x != toX) {
                robot.stepForward();
                x = robot.getX();
            }
        } else if (x > toX) {
            turnTo(robot, Direction.LEFT);
            while (x != toX) {
                robot.stepForward();
                x = robot.getX();
            }
        }
        if (y < toY) {
            turnTo(robot, Direction.UP);
            while (y != toY) {
                robot.stepForward();
                y = robot.getY();
            }
        } else if (y > toY) {
            turnTo(robot, Direction.DOWN);
            while (y != toY) {
                robot.stepForward();
                y = robot.getY();
            }
        }
    }

    public static void turnTo(Robot robot, Direction dir) {
        while (robot.getDirection() != dir) {
            robot.turnRight();
        }
    }

    public static class RobotConnectionManager {
        public RobotConnection getConnection() throws RobotConnectionException {
            // Возвращает соединение с роботом
            return new RobotConnection();
        }
    }

    public static class RobotConnection {
        public void moveRobotTo(int x, int y) {
            // Перемещает робота в указанные координаты
        }

        public void close() {
            // Закрывает соединение с роботом
        }
    }

    public static class RobotConnectionException extends Exception {
        public RobotConnectionException(String message) {
            super(message);
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
        RobotConnection connect = null;
        for (int i = 0; i < 3; i++) {
            try {
                connect = robotConnectionManager.getConnection();
                connect.moveRobotTo(toX, toY);
                // Если удалось переместиться к указанным координатам, выходим из цикла
                break;
            } catch (Exception e1) {
                if (i == 2) {
                    // Если это последняя попытка и не удалось переместиться, пробрасываем исключение
                    throw new Exception("Не удалось установить соединение с роботом.");
                }
            } finally {
                if (connect != null) {
                    try {
                        connect.close();
                    } catch (Throwable ignored) {
                        // Игнорируем исключение при закрытии соединения
                    }
                }
            }
        }
    }
}