package tn.fss

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform