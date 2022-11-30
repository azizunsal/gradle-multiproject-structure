## Gradle Multi Project Structure

### Intro

A common project layout is like that when you create your project via `gradle init`:
```
.
├── app
│   ...
│   └── build.gradle
└── settings.gradle
```

Actually, this is a structure of a **multi-project build** that consist of a single subproject called `app`.

And the root project doesn't have a Gradle build file, only a settings file that defines the subprojects.

### Advanced Topics

#### Sharing Build Logic between Subprojects

Usually, subprojects in a multi-project build share some common traits. For example, several subprojects may contain code in a particular programming language while another subproject may be dedicated for documentation. Code quality rules apply to all of the code subprojects but not the documentation subproject.

Documentation can be found [here](https://docs.gradle.org/current/userguide/sharing_build_logic_between_subprojects.html#sharing_build_logic_between_subprojects).