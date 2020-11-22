# Unfiltered Websockets g8 template

A simple [g8][g8] template demoing [unfiltered][uf] [websockets][ws]

## template properties

* name: the name of the websocket project (Unfiltered WebSockets)
* unfiltered_version: unfiltered library version (latest)
* websocket_port: port to start server on (5678)
* socket_connections: number of browser clients to open on startup (4)

## install

    g8 unfiltered/unfiltered-websockets
    # fill in template properties
    cd name-you-gave-project && sbt run

2010-2012 Doug Tangren (softprops)

[g8]: https://github.com/foundweekends/giter8#readme
[uf]: http://unfiltered.ws
[ws]: https://github.com/unfiltered/Unfiltered/tree/96f61ac3f6c/netty-websockets/#readme
