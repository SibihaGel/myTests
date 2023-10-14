package org.example;
/*

Решение проблемы (листинг 3.5) заключается в том, чтобы похоронить команду
switch в фундаменте АБСТРАКТНОЙ ФАБРИКИ [GOF] и никому ее не показывать. Фабрика использует команду switch для создания соответствующих экземпляров потомков Employee, а вызовы функций calculatePay, isPayDay, deliverPay
и т. д. проходят полиморфную передачу через интерфейс Employee.

----------------------------------------------------

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
}

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

public class EmployeeFactoryImpl implements EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
        switch (r.type) {
            case COMMISSIONED:
                return new CommissionedEmployee(r) ;
            case HOURLY:
                return new HourlyEmployee(r);
            case SALARIED:
                return new SalariedEmploye(r);
            default:
                throw new InvalidEmployeeType(r.type);
        }
    }
}

 */

//// Интерфейс EmployeeFactory
//public interface EmployeeFactory {
//    Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
//}
//
//// Класс EmployeeFactoryImpl, реализующий интерфейс EmployeeFactory
//public class EmployeeFactoryImpl implements EmployeeFactory {
//    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
//        switch (r.type) {
//            case COMMISSIONED:
//                return new CommissionedEmployee(r);
//            case HOURLY:
//                return new HourlyEmployee(r);
//            case SALARIED:
//                return new SalariedEmployee(r);
//            default:
//                throw new InvalidEmployeeType(r.type);
//        }
//    }
//}
//
//// Класс EmployeeRecord
//public class EmployeeRecord {
//    public EmployeeType type;
//    // Другие поля и методы...
//}
//
//// Перечисление EmployeeType
//public enum EmployeeType {
//    COMMISSIONED,  // С комиссионной оплатой
//    HOURLY,        // С почасовой оплатой
//    SALARIED       // С фиксированной оплатой
//}
//
//// Абстрактный класс Employee
//public abstract class Employee {
//    // Общие методы и поля сотрудника...
//    public abstract boolean isPayday();
//    public abstract Money calculatePay();
//    public abstract void deliverPay(Money pay);
//}
//
//// Конкретные классы сотрудников
//public class CommissionedEmployee extends Employee {
//    // Реализация, специфичная для сотрудников с комиссионной оплатой...
//}
//
//public class HourlyEmployee extends Employee {
//    // Реализация, специфичная для сотрудников с почасовой оплатой...
//}
//
//public class SalariedEmployee extends Employee {
//    // Реализация, специфичная для сотрудников с фиксированной оплатой...
//}
//
//// Исключение InvalidEmployeeType
//public class InvalidEmployeeType extends Exception {
//    // Реализация исключения...
//}
//
//// Пример использования
//public class Main {
//    public static void main(String[] args) {
//        // Создание экземпляра фабрики сотрудников
//        EmployeeFactory factory = new EmployeeFactoryImpl();
//
//        // Создание записи о сотруднике
//        EmployeeRecord record = new EmployeeRecord();
//        record.type = EmployeeType.COMMISSIONED;
//        // Задание других полей записи...
//
//        try {
//            // Использование фабрики для создания сотрудника на основе записи
//            Employee employee = factory.makeEmployee(record);
//
//            // Теперь можно работать с созданным сотрудником
//            boolean isPayday = employee.isPayday();
//            Money pay = employee.calculatePay();
//            employee.deliverPay(pay);
//
//            //... Другие операции со сотрудником
//        } catch (InvalidEmployeeType e) {
//            // Обработка исключения, если встречается недопустимый тип сотрудника
//            System.out.println("Недопустимый тип сотрудника: " + e.getMessage());
//        }
//    }
//}