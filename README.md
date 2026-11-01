# Syntech-MobileApp
Android Studio Kotlin Mobile Application for Syntech Software

## Running the Syntech Software Mobile Application

### Prerequisites
Before running the application, make sure you have:
1. Android Studio - Quail 3 or later
2. Android SDK installed through Android Studio
3. Git & Git Bash

### Step 1 - Clone the repository using Android Studio
1. Open Android Studio
2. On the Android Studio start screen, select Clone Repository
3. Select Git as the version control system
4. Enter the GitHub repository URL: https://github.com/SyntechSoftware-INSY7315/Syntech-MobileApp.git
5. Choose the local folder where you want to save the project
6. Click Clone
7. Sign in to GitHub if Android Studio asks you to authenticate
8. Android Studio will download the repository and open the project.
9. Once the repository has been cloned, Android Studio may open the project using the default main branch. The main branch currently contains the initial project template, so you must switch to the develop branch to access the completed application.
10. Close Android Studio and Open File Explorer and navigate to the folder where you cloned the repository
11. Right-click inside the project folder and select Open Git Bash Here
12. Check the current branch by entering: git branch
13. The expected output should be: * main
14. Create and switch to the develop branch by entering: git switch develop
15. If Git reports that the develop branch does not exist locally, create a local develop branch that tracks the remote branch using: git checkout -b develop origin/develop
16. Verify that you are now on the develop branch by entering: git branch
17. Expected output: * develop, main
18. The asterisk (*) indicates your current branch
19. Once you have successfully switched to develop, pull the latest code by entering the following command: git pull origin develop
20. When the pull has completed successfully, close Git Bash and reopen Android Studio
21. On the Android Studio start screen, select the recently cloned solution
22. Allow Android Studio to complete the Gradle Sync

### Step 2 - Clone Using Git Bash (Skip this if step 1 works)
If cloning through Android Studio does not work, the repository can be cloned using Git Bash:

1. Choose a folder on your local machine where you want to save the project
2. Open Git Bash in that folder and run: git clone https://github.com/SyntechSoftware-INSY7315/Syntech-MobileApp.git
3. Once the repository has been cloned, Android Studio may open the project using the default main branch. The main branch currently contains the initial project template, so you must switch to the develop branch to access the completed application.
4. Check the current branch by entering: git branch
5. The expected output should be: * main
6. Create and switch to the develop branch by entering: git switch develop
7. If Git reports that the develop branch does not exist locally, create a local develop branch that tracks the remote branch using: git checkout -b develop origin/develop
8. Verify that you are now on the develop branch by entering: git branch
9. Expected output: * develop, main
10. The asterisk (*) indicates your current branch
11. Once you have successfully switched to develop, pull the latest code by entering the following command: git pull origin develop
12. When the pull has completed successfully, close Git Bash
13. Open Android Studio and select File > Open and select the cloned Syntech-MobileApp project folder
14. Allow Android Studio to complete the Gradle Sync

### Step 3 - Select an Android Device
The mobile application can be run using either an Android emulator or a physical Android device

* Option A — Android Emulator
  1. In Android Studio, open Device Manager
  2. Create or select an Android Virtual Device (AVD)
  3. Start the emulator
  4. Select the emulator from the device dropdown at the top of Android Studio

* Option B — Physical Android Device
  1. Enable Developer Options on the Android device
  2. Enable USB Debugging
  3. Connect the device to the computer using a USB cable
  4. Allow the computer to access the device when prompted
  5. Select the device from Android Studio's device dropdown

### Step 4 - Run the Application
Once the project has finished syncing and an Android device or emulator is selected, do the following:

1. Select the mobile application configuration from the run configuration dropdown
2. Click the Run button in Android Studio or press Shift + F10
3. Android Studio will build and install the application on the selected device
