fun variableName(name: String) = name.all { it.isLetterOrDigit() || it == '_'}.and(!name[0].isDigit())