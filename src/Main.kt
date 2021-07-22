fun main() {
    print(findEmailDomain("fffff@yahoo.com"))
}

fun findEmailDomain(address: String)=address.slice(address.lastIndexOf('@')+1 until address.length)
