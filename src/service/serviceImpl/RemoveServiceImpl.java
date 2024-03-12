package service.serviceImpl;

import service.RemoveService;

public class RemoveServiceImpl implements RemoveService {
    @Override
    public String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder(); // Создаем StringBuilder для хранения результата

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) { // Проверяем, если символ уже присутствует в результате
                result.append(currentChar); // Если нет, добавляем его
            }
        }

        return result.toString(); // Возвращаем строку без дубликатов
    }
}
