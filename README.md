# Navigation Drawer Demo

An Android application developed as part of a mobile development laboratory exercise. The application demonstrates the implementation of a Navigation Drawer pattern using Java and XML-based Views, following Android best practices for fragment management and navigation.

---

## Project Information

| Field | Details |
|---|---|
| Package Name | `com.test.navigationdrawerdemo` |
| Programming Language | Java |
| Minimum SDK | API 24 (Android 7.0 Nougat) |
| Target SDK | API 34 (Android 14) |
| Project Template | Basic Views Activity |
| Build System | Gradle with Groovy DSL |

---

## Overview

This application implements a side navigation drawer that allows the user to navigate between three distinct fragments. Each fragment is loaded dynamically into a FrameLayout container using the Android Fragment Manager. The drawer is triggered via a toolbar toggle button and closes automatically after a menu item is selected.

The project was built from scratch without relying on the Navigation Drawer Activity template, in order to better understand the underlying components and their relationships.

---

## Features

- A fully functional Navigation Drawer using DrawerLayout and NavigationView
- Three navigable destinations accessible from the side menu
- Fragment 1 (Accueil): displays a welcome screen with a warm-toned background
- Fragment 2 (Tableau de Bord): displays a dashboard screen with a mint-toned background
- Fragment List (Ma Liste): displays a scrollable list of items using ListFragment and ArrayAdapter
- Custom vector icons for each menu item created using Vector Asset Studio
- Automatic drawer closure after navigation selection
- Back press handling to close the drawer before exiting the activity

---

## Project Structure

```
app/
├── java/com/test/navigationdrawerdemo/
│   ├── MainActivity.java
│   ├── BlankFragment.java
│   ├── BlankFragment2.java
│   └── FragmentList.java
└── res/
    ├── layout/
    │   ├── activity_main.xml
    │   ├── fragment_blank.xml
    │   └── fragment_blank2.xml
    ├── menu/
    │   └── activity_main_drawer.xml
    ├── values/
    │   ├── strings.xml
    │   └── themes.xml
    └── drawable/
        ├── ic_home.xml
        ├── ic_dashboard.xml
        └── ic_list.xml
```

---

## Architecture and Key Components

**MainActivity.java** serves as the entry point of the application. It initializes the toolbar, connects the DrawerLayout with an ActionBarDrawerToggle, and implements NavigationView.OnNavigationItemSelectedListener to handle menu item selection. Fragment transactions are performed using getSupportFragmentManager().replace().commit().

**BlankFragment.java and BlankFragment2.java** are simple blank fragments created using the Fragment (Blank) template with factory methods and interface callbacks disabled. Each fragment has a distinct background color defined in its XML layout file.

**FragmentList.java** extends ListFragment and populates a list using an ArrayAdapter with a predefined array of string items. The list is initialized inside the onActivityCreated() method.

**activity_main_drawer.xml** defines the three menu items displayed in the navigation drawer, each referencing a vector drawable icon and a string title.

**activity_main.xml** contains the root DrawerLayout which wraps a LinearLayout holding the toolbar and the FrameLayout fragment container, alongside the NavigationView component anchored to the start of the screen.

---

## Dependencies

```groovy
implementation libs.appcompat
implementation libs.material
implementation libs.activity
implementation libs.constraintlayout
implementation libs.navigation.fragment
implementation libs.navigation.ui
```

---

## Demo Video




https://github.com/user-attachments/assets/083b8a97-2248-41a2-8270-33db5a3f20ab


---

## Getting Started

Clone the repository and open it in Android Studio:

```bash
git clone https://github.com/lailaelamiri/Navigation-Drawer-.git
```

Run the application on an emulator or physical device running Android 7.0 (API 24) or higher.

---

## Author

Laila Elamiri  
[github.com/lailaelamiri](https://github.com/lailaelamiri)
