# Mobile-Desktop 3D Asset Interaction App

## Objective
This project aims to develop a mobile and desktop application that loads, animates, and allows interactive manipulation of two 3D assets in the `.glb` format. The app supports smooth transitions, rendering optimizations, and user interactions, offering a foundation for more 3D-intensive applications.

## Features
- **3D Asset Loading**: Loads two `.glb` files and displays them in the scene with proper scaling.
- **Animation & Interaction**:
  - **Mobile**: On-screen buttons control the movement (e.g., direction change).
  - **Desktop**: Keyboard controls:
    - Arrow keys (Left/Right) to rotate or move the object.
    - Spacebar to make the object jump.
- **Animation Library**: Integrates animations from the [Ready Player Me Animation Library](https://github.com/readyplayerme/animation-library).
- **Performance Optimization**: Smooth animation transitions and optimized rendering for high performance on both mobile and desktop devices.

## Requirements
- **Mobile**: On-screen buttons to control 3D assets.
- **Desktop**: Keyboard controls (Arrow keys to rotate/move, Spacebar to jump).
- **Assets**:
  - 3D avatars from the [Ready Player Me 3D Library](https://readyplayer.me/3d-avatars).
  - Animations from the [Ready Player Me Animation Library](https://github.com/readyplayerme/animation-library).
- **Environment**: The app must run smoothly without lag or performance issues.

## How to Run the App
### Prerequisites
1. Install **Node.js** and **npm**.
2. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/3d-interaction-app.git
    cd 3d-interaction-app
    ```
3. Install dependencies:
    ```bash
    npm install
    ```

### Running the Application
- **For mobile**: Run using Appetize.io or other mobile app emulators.
- **For desktop**: Run locally by launching the app with:
    ```bash
    npm start
    ```

## Controls
- **Mobile**:
  - Use on-screen buttons to control the movement of the 3D objects (change direction).
  
- **Desktop**:
  - **Arrow keys** (Left/Right) to rotate or move the 3D object.
  - **Spacebar** to make the object jump.

## Performance and Optimization
The app is optimized for smooth rendering and interaction across devices, with particular focus on reducing lag during animation transitions.

## Bonus Features (Optional)
- Gesture-based controls for mobile.
- Lighting effects or environmental enhancements.
- Support for uploading multiple 3D assets.

## Submission
- **Appetize Link**: [Link to your app on Appetize](#)
- **GitHub Repository**: [Link to your GitHub Repo](#)
- **Video Walkthrough**: [Link to your Google Drive Walkthrough](#)

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

