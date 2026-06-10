# java-codes

A collection of standalone Java programs covering core syntax, object-oriented programming, GUI development, multithreading, and networking, written as coursework and lab practice.

## Overview

This repository holds Java source files written while learning and practicing Java, organized into folders by topic and by the course context they were written for (lab sessions, lecture demos, exam revision). There is no single application here — each `.java` file is an independent, runnable example that demonstrates one concept, from a basic `for` loop to a small multi-class mini-project such as a bus reservation system.

Because the files were written incrementally over time, style and structure vary between them, and some folders (`codesForExam`) contain reworked, more complete versions of examples that also appear elsewhere (`clgCodesTY`), created while revising for exams.

## Features

- **Core syntax and control flow** — loops (`for`, `while`, `do-while`), `if`/`else` and nested conditionals, `switch` statements, jump statements (`break`/`continue`), pattern printing, arrays, and methods (with arguments, return values, and overloading).
- **Object-oriented programming** — classes and objects, constructors (default and parameterized), single/multilevel/hierarchical inheritance, the diamond problem, method overloading and overriding, encapsulation, interfaces, abstract classes, and static/instance initializer blocks.
- **GUI programming (AWT and Swing)** — frames, labels, text fields, buttons, checkboxes and radio buttons, password fields, text areas, and dialogs built with `JOptionPane` (message, input, confirm).
- **Layout managers** — dedicated examples for `BorderLayout`, `BoxLayout`, `CardLayout`, `FlowLayout`, `GridLayout`, and manual/null layout positioning.
- **Multithreading** — creating threads via `extends Thread` and `implements Runnable`, and demonstrating `sleep`, `join`, `interrupt`, `isAlive`, `yield`, thread priority, and synchronized methods.
- **Networking** — TCP communication with stream sockets (`ServerSocket`/`Socket`), UDP communication with `DatagramSocket`/`DatagramPacket`, address resolution with `InetAddress`, and URL parsing.
- **Mini-projects** — a Swing calculator, a bank account system with deposits/withdrawals, a bus reservation system with seat tracking and fare calculation by passenger type, and a university admission form.

## Tech Stack

| Category | Details |
|---|---|
| Language | Java |
| GUI | AWT, Swing |
| Networking | `java.net` (TCP/UDP sockets), `java.io` |
| Build | None — compiled directly with `javac`/`java` (no Maven/Gradle project) |

## Project Structure

```
java-codes/
├── *.java, *.class          # Root-level exercises: loops, conditionals, patterns,
│                             # functions, arrays, and basic OOP demos
├── clgCodesTY/               # Topic-organized coursework
│   ├── AWT/                  # AWT calculator, event handling, UI elements
│   ├── JOptionpane/          # Message, input, and confirm dialogs
│   ├── LayoutManagers/       # One example per layout manager
│   ├── Multithreading/       # Thread lifecycle method examples
│   ├── Networking/           # Stream sockets, datagram sockets, InetAddress, URLs
│   ├── Swing/                # Swing components (buttons, checkboxes, radio, etc.)
│   ├── oopJavaClg/           # Inheritance, polymorphism, encapsulation, blocks
│   └── abstractWindowToolkit/
├── codesForExam/             # Revised/expanded versions of the topics above,
│                             # prepared for exam review (datagram, joptpane,
│                             # layoutmng, Multithreading, networking)
├── lab/                      # Lab-session programs, including a lab/thread/ subfolder
│   └── thread/
├── Lecture/                  # Lecture-demo programs (bus reservation, bg changer,
│   └── thread/                #  payroll), including a Lecture/thread/ subfolder
└── README.md
```

Each program is self-contained with its own `main` method and no package declaration (a few files have package statements commented out), so files are compiled and run individually rather than as one combined application.

## Getting Started

### Prerequisites

- A Java Development Kit (JDK) with `javac` and `java` on the `PATH`.
- A graphical display for the AWT/Swing examples (they open windows and will not run headless).

### Run locally

Most programs are single files. Compile and run one directly:

```bash
javac HelloWorld.java
java HelloWorld
```

For array/interactive examples that use `Scanner` (e.g. `Marks.java`), input is read from standard input at runtime.

Client/server networking examples must be compiled and run from within their own folder, starting the server first:

```bash
cd clgCodesTY/Networking/StreamSocket
javac Server.java Client.java
java Server &
java Client
```

The same pattern applies to the `DataGram`, `DatagramSocket`, and `codesForExam/networking` examples — each client/server pair listens on a hard-coded port (for example `6666` or `9876`) defined in the source.

## Design Decisions

- **No package hierarchy.** Every class lives in the default package, and identically named classes (e.g. multiple `Client.java`/`Server.java` files) are kept apart by folder rather than by Java package, so each example can be compiled and run independently without classpath conflicts with the others.
- **Compiled `.class` files are checked in** alongside their `.java` sources for many exercises, reflecting how the programs were run directly from an editor rather than through a build tool.

## Future Improvements

- Add package declarations and a build tool (Maven/Gradle) so related classes (e.g. all `Multithreading` examples) can be compiled together without folder-based class name workarounds.
- Remove committed `.class` files and add a `.gitignore` for compiled output.
- Consolidate `codesForExam` with `clgCodesTY` once the exam-revision versions are confirmed final, to avoid maintaining two copies of the same topics.
