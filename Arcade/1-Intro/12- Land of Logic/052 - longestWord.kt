fun longestWord(text: String) = text.split(Regex("[^a-zA-Z]")).maxBy { it.length }!!