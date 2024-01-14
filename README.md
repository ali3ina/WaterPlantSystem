# Automatic Water Plant System with Arduino Grove Beginner Kit

## Overview

This repository contains the code and documentation for an Automatic Water Plant System implemented using Java and connected to an Arduino Grove Beginner Kit. The project aims to automate the watering process for plants by integrating sensors and actuators. The system utilizes Java for control and monitoring, and Arduino for interfacing with the physical components.

## Project Components

- **Java Control System:**
  - Monitors and controls the watering system.
  - Communicates with Arduino over USB using the Firmata protocol.

- **Arduino Grove Beginner Kit:**
  - Utilizes various sensors and actuators for measuring soil moisture and controlling water flow.

## How It Works

1. The Java control system reads soil moisture data from the Arduino sensors.
2. Based on predefined moisture thresholds, the system decides whether to activate the water pump.
3. The Arduino controls the water pump to irrigate the plant if the soil moisture is below the set threshold.

## Video Explanation

For a detailed explanation and demonstration of the project, refer to the [YouTube video](https://youtu.be/83cAyNRbrgg?si=DQ1vyvbT0ll12CzP).

## How to Run

1. **Arduino Setup:**
   - Connect the soil moisture sensor and water pump from the Grove Beginner Kit to your Arduino.
   - Upload the provided Arduino code (`Arduino_WaterPlant.ino`) to your Arduino board.

2. **Java Setup:**
   - Ensure you have Java installed on your computer.
   - Open the Java control system code (`WaterPlantControl.java`) in your preferred Java IDE.
   - Run the Java program to monitor and control the water plant system.

## Project Structure

- **Arduino_WaterPlant.ino:**
  - Arduino code for reading soil moisture and controlling the water pump.

- **WaterPlantControl.java:**
  - Java code for monitoring soil moisture and controlling the watering system.

## Conclusion

The Automatic Water Plant System demonstrates the integration of Java and Arduino for an efficient and automated plant care solution. The system ensures optimal soil moisture levels for plant growth.

Feel free to explore the repository, watch the video, and contribute to the project's improvement!

**Note:** For detailed implementation steps, refer to the video linked above.
