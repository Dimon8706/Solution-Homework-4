Project Documentation

Overview
This project demonstrates two key design patterns: Singleton (Configuration Manager) and Adapter (Chat Adapter). Each component addresses specific design principles:

- Singleton Pattern: Ensures only one instance of a configuration manager exists.
- Adapter Pattern: Allows incompatible interfaces to work together seamlessly.

Directory Structure

Homework4
├── part1
│   ├── ConfigurationManager.java
│   └── ConfigManagerDemo.java
└── part2
    ├── ChatService.java
    ├── ChatAdapterDemo.java
    ├── adapter
    │   └── ChatServiceAdapter.java
    └── legacy
        └── LegacyChatService.java

Compilation and Execution Instructions

Compilation
Navigate to the root directory of your project and compile using:

```shell
javac Homework4/part1/*.java Homework4/part2/*.java Homework4/part2/adapter/*.java Homework4/part2/legacy/*.java
```

Execution
Run the demos separately:

- Configuration Manager Demo:
  ```shell
  java Homework4.part1.ConfigManagerDemo
  ```

- Chat Adapter Demo:
  ```shell
  java Homework4.part2.ChatAdapterDemo
  ```
Sample Output

Configuration Manager Demo
```
maxPlayers = 100
defaultLanguage = en
gameDifficulty = medium
Current Configuration Settings:
  maxPlayers = 100
  defaultLanguage = en
  gameDifficulty = medium
```

Chat Adapter Demo
```
Legacy Chat: Hello world!
```

Detailed Component Description

Singleton Pattern - ConfigurationManager

Class: `ConfigurationManager`
- **Responsibility**: Manages application configuration with a single instance.
- **Methods**:
  - `getInstance()`: Provides access to the single instance.
  - `getConfig(String key)`: Retrieves configuration value for the given key.
  - `printAllConfigs()`: Prints all configurations.

Demo: `ConfigManagerDemo`
- Demonstrates retrieving and printing configuration values.

Adapter Pattern - Chat Service Adapter

Interface: `ChatService`
- Responsibility: Defines the chat message sending contract.
- Methods:
  - `sendMessage(String message)`: Sends a chat message.

#### Class: `LegacyChatService`
- Responsibility: Existing legacy service providing old message sending capability.
- Methods:
  - `sendLegacyMessage(String message)`: Sends a legacy-formatted chat message.

Adapter Class: `ChatServiceAdapter`
- Responsibility: Adapts the `LegacyChatService` to the `ChatService` interface.
- Methods:
  - Implements `sendMessage(String message)` by delegating to the legacy method.

Demo: `ChatAdapterDemo`
- Demonstrates the use of the adapter to integrate and send a message through the legacy service.

Code Quality
- Classes are organized into clear and meaningful packages.
- Proper Java naming conventions are followed throughout.
- Each class respects Single Responsibility and Dependency Inversion principles.
