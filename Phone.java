package org.example;



class Phone {


    public static void main(String args[]) {
        
        String numbers[][] = {

                {"Tom", "M555-33 22"},
                {"Mary", "555-89 76"},
                {"John", "555-10 37 "},
                {"Rachel", "555-14 00"}
        };
        int i;
        if (args.length != 1) {
            System.out.println(" Иcпoльзoвaниe : java Phone <имя> "); // java C:\Users\sibih\IdeaProjects\kataProjects\Sobesy\src\main\java\org\example\Phone.java Mary

        } else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println(" Имя не найдено .");
        }
    }
}

