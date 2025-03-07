package Homework4.part2.adapter;

import Homework4.part2.ChatService;
import Homework4.part2.legacy.LegacyChatService;

public class ChatServiceAdapter implements ChatService {

    private LegacyChatService legacyChat;

    public ChatServiceAdapter(LegacyChatService legacyChat) {
        this.legacyChat = legacyChat;
    }

    @Override
    public void sendMessage(String message) {
        legacyChat.sendLegacyMessage(message);
    }
}
