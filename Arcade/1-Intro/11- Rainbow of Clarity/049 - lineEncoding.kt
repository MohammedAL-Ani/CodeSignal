fun lineEncoding(s: String): String = s.replace("(.)\\1+".toRegex()) { result -> "${result.value.length}${result.value[0]}" }