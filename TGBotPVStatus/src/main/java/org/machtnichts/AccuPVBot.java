package org.machtnichts;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class AccuPVBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        // TODO
    }

    @Override
    public String getBotUsername() {
        return "Pretty Accu Pv Bot";
    }

    @Override
    public String getBotToken() {
        return null;
    }
}