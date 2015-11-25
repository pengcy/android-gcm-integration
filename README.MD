# Google Cloud Messaging Integration for Android
1. Create google cloud messaging backend module in your Android app.

   File -> New -> New Module -> Google Cloud Message -> Next -> select App Engine Backend with Google Cloud Messaging from the Modlue type drop down -> Finish

2. Change the File Explorer Menu from Android to Project, and find the appengine-web.xml in the backend folder, then follow the README.MD in xml folder

3. Build the backend module and deploy it to Google App Engine.
   Select backend from the dropdown next to the run button in Android Studio -> Build -> Rebuild Project -> Deploy Module to App Engine -> it will ask you to sign into your google account in Android Studio

4. Go to Google Developer Console and find App Engine Dashboard and then find the url for your Google Cloud Messaging. ex: https://console.developers.google.com/appengine?project=yourapp-id

5. Switch back to app from the dropdown menu next to the run button in Android Studio.

6. Follow the README.MD in the java folder in this repo.

7. Follow the README.MD in the gradle folder in this repo.

8. Install and run your Android app on a device.

9. Go to your Google Cloud Message console (ex: https://yourapp-id.appspot.com/) and send a push notification message, and expect that to be received from your device. It doesn't work on emulators.
