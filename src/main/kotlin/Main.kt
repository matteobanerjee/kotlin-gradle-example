import io.javalin.Javalin

data class HelloResponse(val message: String)
fun main(args: Array<String>) {
    val server = Javalin.create()

    server.get("/hello") { ctx ->
        ctx.json(HelloResponse("hello world"))
    }

    server.port(3003).start()
}
