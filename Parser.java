package org.example;

import java.io.*;

public class Parser {
    private static File file = new File("C:\\Users\\sibih\\IdeaProjects\\kataProjects\\Sobesy\\src\\main\\resources\\text");
    public static File file1 = new File("C:\\Users\\sibih\\IdeaProjects\\kataProjects\\Sobesy\\src\\main\\resources\\file1");
    public synchronized void setFile(File f) {
        file = f;
    }
    public File getFile() {
        return file;
    }

    public static void main(String[] args) throws IOException {

//        System.out.println(getContent(file));
//        System.out.println(getContentWithoutUnicode(file));
        saveContent(getContentWithoutUnicode(file));
    }
 /*   public String getContent() throws IOException {
        InputStream i = new FileInputStream(file);
        String output = "";
        int data;
        while ((data = i.read()) > 0) {
            output += (char) data;
        }
        return output;
    }
    В представленном коде метода getContent(), есть несколько проблем, которые могут вызвать нежелательное поведение:

Использование оператора > в условии цикла while может привести к неправильному чтению данных. Оператор > проверяет,

что значение data больше нуля, что может привести к преждевременному завершению цикла. Вместо этого, вы должны использовать оператор != -1 для проверки, что достигнут конец файла.

Конкатенация строк внутри цикла с использованием оператора += неэффективна, особенно для больших файлов, так как каждая конкатенация создает новую строку.

Вместо этого, вы можете использовать StringBuilder для эффективной конкатенации строк.

Поток InputStream не закрывается явно, что может привести к утечке ресурсов. Рекомендуется закрывать поток после использования, чтобы гарантировать правильное освобождение ресурсов.

  */
//    public static String getContent(File file) throws IOException {
//        StringBuilder output = new StringBuilder();
//        try (InputStream i = new FileInputStream(file)) {
//            int data;
//            while ((data = i.read()) != -1) {
//                output.append((char) data);
//            }
//        }
//        return output.toString();
//    }
    public static String getContentWithoutUnicode(File file) throws IOException {
        StringBuilder output = new StringBuilder();
        try (InputStream i = new FileInputStream(file)) {
            int data;
            while ((data = i.read()) != -1) {
                System.out.print(data + " ");
                if (data <= 127) {
                   output.append((char) data);
                }
            }
        }
        System.out.println();
        return output.toString();
    }

    /*public void saveContent(String content) throws IOException {
        OutputStream o = new FileOutputStream(file);
        for (int i = 0; i < content.length(); i += 1) {
            o.write(content.charAt(i));
        }

     */
    public static void saveContent(String contentWithoutUnicode) throws IOException {
        try (OutputStream o = new FileOutputStream(file1)) {
            o.write(contentWithoutUnicode.getBytes());

        }
        System.out.println(contentWithoutUnicode);
    }
}
