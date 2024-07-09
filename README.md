# Smart Home System

The Smart Home System is a Java-based application designed to manage and control smart devices within a home. This system includes functionalities such as turning devices on and off, setting schedules, and adding triggers based on specific conditions. The project follows best practices in object-oriented programming and design patterns to ensure maintainability and scalability.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Classes and Structure](#classes-and-structure)
- [Contributing](#contributing)

## Features

- Manage various smart devices (e.g., lights, thermostats, door locks).
- Implement commands such as `turnOn`, `turnOff`, `setSchedule`, and `addTrigger`.
- Use design patterns like Proxy, Singleton, Factory, and Observer.
- Schedule tasks to automate device control.
- Add triggers based on device conditions.

## Installation

To set up the project locally, follow these steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/zendivyanshu/SmartHomeSystem.git
    ```

2. Navigate to the project directory:
    ```sh
    cd SmartHomeSystem
    ```

3. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA).

4. Ensure you have Java installed. You can set up your Java environment as specified:
    ```
    /Users/divyanshusingh-zen/Library/Java/JavaVirtualMachines/openjdk-22.0.1/Contents/Home/bin/java
    ```

## Usage

To run the project, execute the `Main` class located in the `src/main` package. This will start the Smart Home System, allowing you to interact with the various smart devices and test the implemented functionalities.

### Example Commands

- **Turn on a device**:
    ```java
    SmartDevice light = new Light("light1");
    light.turnOn();
    ```

- **Set a schedule**:
    ```java
    SmartHomeHub hub = new SmartHomeHub();
    hub.setSchedule(light, "18:00", "turnOn");
    ```

- **Add a trigger**:
    ```java
    hub.addTrigger(thermostat, "temperature", 25, "turnOff", light);
    ```

## Classes and Structure

- **Devices**:
    - `SmartDevice`: Abstract class representing a generic smart device.
    - `Light`, `Thermostat`, `DoorLock`: Concrete implementations of `SmartDevice`.

- **Hub**:
    - `SmartHomeHub`: Manages devices and schedules.
    - `Observable`: Interface for implementing the observer pattern.
    - `SmartDeviceProxy`: Proxy class for secure access to devices.

- **Factory**:
    - `SmartDeviceFactory`: Creates instances of smart devices.

- **Observer**:
    - `Observer`: Interface for observer pattern implementation.

- **Main**:
    - `Main`: Entry point of the application.



## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure your code adheres to the project's coding standards and includes appropriate tests.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


