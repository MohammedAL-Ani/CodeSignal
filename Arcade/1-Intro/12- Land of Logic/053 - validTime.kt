fun validTime(time: String) = time.slice(0..1).toInt() in 0..23 && time.slice(3..4).toInt() in 0..59