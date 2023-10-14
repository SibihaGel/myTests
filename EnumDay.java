package org.example;


import java.util.*;

public enum EnumDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private static void isHollyday(EnumDay day) {

        EnumSet<EnumDay> hollidays = EnumSet.of(EnumDay.SUNDAY, EnumDay.SATURDAY);


        if (hollidays.contains(day)) {
            System.out.println("Сегодня выходной !");
        } else {
            System.out.println("Придется еще поработать.. " + day);
        }
    }

    public static void main(String[] args) {
        isHollyday(MONDAY);
//            EnumDay day;
//            day = EnumDay.TUESDAY;
//            boolean isWeekend = day.isWeekend();
//
//
//
//
//            if(hollidays.contains(day)) {
//                return ;
//            }
//
//            int a = 5;
//            switch (a) {
//                case 0: {
//                    System.out.println("0");
//                    break;
//                }
//                case 5: {
//                    System.out.println("5");
//                }
//                case 9: {
//                    System.out.println("9");
//                    break;
//                }
//                case 10: {
//                    System.out.println("10");
//                }
//                default: {
//                    System.out.println("!");
//                }
//        }
//
//            EnumDay day;
//            day = EnumDay.TUESDAY;
//            boolean isWeekend = day.isWeekend();
//
//            if (isWeekend == true) {
//                System.out.println("Cегодня выходной!");
//                System.out.println("--------------------");
//            } else {
//                System.out.println("Нужно еще поработать(");
//            }
//            System.out.println(day);  // Вывод: SATURDAY

//        }

//        String dayOfWeek;
//
//        public boolean isWeekend() {
//            return this == EnumDay.SATURDAY || this == EnumDay.SUNDAY;
//        }
//
//
//        public String getRusName() {
//            switch (this) {
//                case MONDAY: {
//                    return "ПОНЕДЕЛЬНИК";
//                }
//                case TUESDAY: {
//                    return "ВТОРНИК";
//                }
//                case WEDNESDAY: {
//                    return "СРЕДА";
//                }
//                case THURSDAY: {
//                    return "ЧЕТВЕРГ";
//                }
//                case FRIDAY: {
//                    return "ПЯТНИЦА";
//                }
//                case SATURDAY: {
//                    return "СУББОТА";
//                }
//                default: {
//                    return "ВОСКРЕСЕНЬЕ";
//                }
//            }

//        }

    }
}

