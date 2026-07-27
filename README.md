# JavaProjects

Java coursework and design-pattern exercises. This repository is a collection of independent IntelliJ IDEA Java modules, not one application or library. The source covers inheritance, interfaces, object association, and several creational and structural patterns.

## Project Inventory

The table lists the tracked source trees and their entry points. Paths are relative to the repository root.

| Exercise | Source root | Entry point |
| --- | --- | --- |
| AED composite and factory method | `AED COMPOSITE + FABRIC METHOD/AED-Composite-Fabric/src` | `Main` |
| Activity 01: inheritance | `Atividade 01 - [T8-Herança]/t1e1/src` | `Main` |
| Activity 02: interfaces and inheritance (complete) | `Atividade 02 - Interfaces e Herança/t2 COMPLETA/t2/src` | `Main` |
| Activity 02: interfaces and inheritance (incomplete) | `Atividade 02 - Interfaces e Herança/t2 inc/t2/src` | `Main` |
| Activity 03: association | `Atividade 03 - Associação/Associacao/Associacao/src` | `Main` |
| Activity 04: Factory Method | `Atividade 04 - Factory Method/atividade4/src` | `Main` |
| Activity 05: Abstract Factory | `Atividade 05 - Abstract Factory/ExercicioSalgados/src` | `Main` |
| Activity 06: Singleton | `Atividade 06 - Singleton/ExercicioSingleton/src` | `Main` |
| Activity 07: Monostate | `Atividade 07 - Monostate/Atividade7Monostate/src` | `Main` |
| N1 assessment: Autobot factories | `N1 1 - Avaliação de N1/Prova/src` | `Main` |
| N2 Activity 01: Builder | `N2 - Atividade 01 (Builder)/n2a1/src` | `main` |
| N2 Activity 01: Builder `after` example | `N2 - Atividade 01 (Builder)/after` | `br.com.cod3r.builder.meal.after.Client` |
| N2 Activity 02: Prototype | `N2 - Atividade 02 (Prototype)/atividade2 N2/src` | `Main` |
| N2 Activity 03: Adapter | `N2 - Atividade 03/Adapter/src` | `Main` |
| N2 Activity 04: Bridge | `N2 - Atividade 04 - Bridge/Atividade 4 n2/src` | `Main` |
| N2 Activity 05: Composite | `N2 - Atividade 05 - Composite/CeasaComposite/src` | `Main` |
| N2 Activity 06: Decorator | `N2 - Atividade 06 - Decorator/Decorator/src` | `Main` |
| N2 Activity 07: Facade | `N2 - Atividade 07 - Facade/Facade/src` | `Main` |
| N2 Activity 08: Mediator | `N2 - Atividade 08 - Mediator/Mediator/src` | `Main` |
| N2 final activity | `N2-1 - Atividade Final/TrabalhoFinal/src` | `Main` |

The repository contains 20 tracked IntelliJ module descriptors (`.iml`). The Association exercise has two descriptors pointing at the same nested source tree, while the Builder `after` example is a source tree without its own `.iml` file.

## Repository Structure

- Top-level activity directories group each assignment with its Java source, IntelliJ metadata, and, in several cases, the original assignment brief or archive.
- Most modules use a `src` source root and expose a default-package `Main` class. The Builder `n2a1` module uses a lowercase `main` class, and the Builder `after` example uses package-qualified sources directly below its directory.
- `.idea` directories and `.iml` files describe IntelliJ modules. The repository root has no shared source root or build configuration.
- `out` directories contain generated IntelliJ compilation output that is already present in the repository.

## Prerequisites

- Use a JDK. JDK 19 is the closest match to the IntelliJ metadata used by most modules.
- The Builder `n2a1` module records JDK 18 in its IntelliJ metadata. The repository does not define one shared Java version or toolchain.
- IntelliJ IDEA can open the individual `.iml` files. There is no root `pom.xml`, Gradle build file, or multi-module build configuration.
- A command-line workflow requires `javac` and `java`.

The current source trees also compiled successfully with JDK 17.0.20 during the readiness check, but the IntelliJ metadata should be treated as the intended development baseline.

## Compile And Run

Each exercise is compiled independently from its own source root. There is no repository-wide build command. The following is a verified example for the Facade exercise; its temporary class directory is kept outside the repository:

```sh
cd "N2 - Atividade 07 - Facade/Facade"
classes="$(mktemp -d)"
javac -d "$classes" src/Main.java src/Facade/*.java src/models/*.java
java -cp "$classes" Main
```

The Builder `after` example uses a package-qualified entry point and a source layout without a `src` directory:

```sh
cd "N2 - Atividade 01 (Builder)/after"
classes="$(mktemp -d)"
javac -d "$classes" Client.java builder/*.java director/*.java model/*.java
java -cp "$classes" br.com.cod3r.builder.meal.after.Client
```

For the other exercises, compile all `.java` files under the source root shown in the inventory and run the listed entry point. The following programs read from standard input during execution: the complete Activity 02 module, Activity 03, Activity 04, and Activity 07's Monostate flow.

## Testing And Status

- There are no tracked Java test sources and no automated test runner.
- A lightweight readiness check compiled all 20 source trees, covering 205 tracked `.java` files, with `javac` 17.0.20 and temporary output directories outside the repository.
- The Facade example and the Builder `after` example were also run successfully after compilation.
- Compilation is not a substitute for behavioral tests. Interactive programs were not exhaustively exercised because they require input.

## Repository Limitations

- The exercises have inconsistent layouts, package naming, and IntelliJ metadata because they were developed as separate assignments.
- Several source directories are accompanied by ZIP, RAR, PDF, DOCX, or text assignment materials.
- Compiled `.class` files are already committed under some exercise `out` directories. This README does not change those artifacts.
- No single command builds, tests, or runs the entire repository.

## Contributing

There is no contribution guide or automated validation workflow in the repository. For a focused change, preserve the existing exercise layout, avoid changing unrelated assignments, compile the affected source tree, and document any new manual steps in this README.

## License

No `LICENSE`, `NOTICE`, or other explicit license file is present. The reuse and distribution terms for this repository have not been specified.
