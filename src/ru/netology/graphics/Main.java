package ru.netology.graphics;

import ru.netology.graphics.image.ConverterGraphicsInText;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new ConverterGraphicsInText(); // Создайте тут объект вашего класса конвертера

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        converter.setMaxWidth(100);
        converter.setMaxHeight(100);
        // Или то же, но с выводом на экран:
//        String url = "https://telecomdom.com/wp-content/uploads/2020/02/kartinki-na-telefon-5-576x1024.jpg";
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}
