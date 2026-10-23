rootProject.name = "Programming-Basics-with-Java"

rootDir.listFiles { f -> f.isDirectory && f.name.matches(Regex("\\d{3}-.+")) }!!
    .sortedBy { it.name }
    .forEach { include(it.name) }
