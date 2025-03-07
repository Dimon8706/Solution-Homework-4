package Homework4.part2;

import Homework4.part2.adapter.ChatServiceAdapter;
import Homework4.part2.legacy.LegacyChatService;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyService = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyService);

        chatService.sendMessage("Hello world!");
    }
}
