package Lab3_Event;

import Lab3_Event.Util.TextManager;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class Laboratory3 {
    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            TextManager textManager = container.select(TextManager.class).get();

            // Первоначальный текст
            textManager.setText("Это пример текста.\nЭтот текст состоит из двух строк.");

            // Изменяем текст и проверяем автоматический пересчет
            textManager.setText("Новый текст для демонстрации работы.\nЭтот текст \nсодержит несколько строк.");
        }
    }
}
