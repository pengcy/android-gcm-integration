In **add_this_to_manifest.xml**, copy the content, update the package name in the category tag, and then add it to the application tag in your android application manifest.xml file.

**appengine-web.sample.xml**
* This file is auto generated when you create the backend module for gcm in Android Studio.
* The application tag needs the project ID which you can find from google developer console.
* The property tab gcm.api.key is the app engine server key which need to be created from google developer console.