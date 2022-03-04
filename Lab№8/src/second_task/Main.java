package second_task;

import second_task.client.Client;
import second_task.server.Server;

// Клиент посылает через сервер сообщение другому клиенту, выбранному из списка //

public class Main {
    public static void main(String[] args) {
        if (args.length > 1) {
            if (args[0].equals("server")) {
                new Server(Integer.parseInt(args[1]));
            }
            else if (args[0].equals("client")) {
                new Client(args[1], Integer.parseInt(args[2]));
            }
        }
    }
}
