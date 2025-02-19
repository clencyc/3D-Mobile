# Mobile-Desktop 3D Asset Interaction App (Kotlin)

## Objective
This project aims to develop an Android application that loads, animates, and allows interactive manipulation of two 3D assets in the `.glb` format. The app supports smooth transitions, rendering optimizations, and user interactions, offering a foundation for 3D-intensive mobile applications using **Kotlin**.

## Features
- **3D Asset Loading**: Loads two `.glb` files and displays them with proper scaling.
- **Animation & Interaction**:
  - **Mobile**: On-screen buttons control the movement (e.g., direction change).
  - **Desktop (Optional)**: Keyboard controls (arrow keys for movement and spacebar to jump).
- **Animation Library**: Integrates animations from the [Ready Player Me Animation Library](https://github.com/readyplayerme/animation-library).
- **Performance Optimization**: Smooth animation transitions and optimized rendering for performance on both mobile and desktop environments.

## Requirements
- **Android Studio**: To build and run the app on Android devices.
- **Kotlin**: The app is developed using Kotlin for Android development.
- **Dependencies**:
  - `GLTF` rendering library or similar for `.glb` file support.
  - Android dependencies for 3D rendering and animations.

## How to Run the App

### Prerequisites
1. Install **Android Studio**: You can download it from [here](https://developer.android.com/studio).
2. Clone this repository:
    ```bash
    git clone https://github.com/yourusername/3d-interaction-app.git
    cd 3d-interaction-app
    ```
3. Open the project in **Android Studio**.
4. Install the necessary dependencies by syncing the project with Gradle:
    - Open Android Studio and sync Gradle to ensure all libraries are downloaded.

### Running the Application
- **For Android (Mobile)**:
    - Connect an Android device or use an emulator to run the application.
    - The app should load two `.glb` files and allow you to interact with them via on-screen buttons.

- **For Desktop (Optional)**:
    - Implement desktop controls if desired (e.g., using a desktop emulator or Kotlin-based desktop app framework like TornadoFX or JavaFX).

## Controls
- **Mobile**:
  - Use on-screen buttons to control the movement and animation of the 3D objects (e.g., change direction, make the object jump).

- **Desktop (Optional)**:
  - **Arrow keys** (Left/Right) to rotate or move the 3D object.
  - **Spacebar** to make the object jump.

## Performance and Optimization
- The app is optimized for smooth rendering and interaction across devices.
- Emphasis on reducing lag and maintaining fluid transitions during animation.

## Bonus Features (Optional)
- Gesture-based controls for mobile.
- Lighting effects or environmental enhancements.
- Support for uploading multiple 3D assets at once.

## Submission
- **Appetize Link**: [Link to your app on Appetize](#) *(if applicable for testing)*
- **GitHub Repository**: [Link to your GitHub Repo](#)
- **Video Walkthrough**: [Link to your Google Drive Walkthrough](#)

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
