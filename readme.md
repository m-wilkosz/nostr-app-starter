# Nostr application starter
[![](https://skills.thijs.gg/icons?i=java,spring,gradle)](https://skills.thijs.gg)

### Description
Spring Boot starter projects for building [Nostr](https://github.com/nostr-protocol/nostr) applications.
Whether you're building your own client or custom relay software, this framework provides most of what you
need to write scalable and efficient solutions effortlessly.

**Note**: Most code is still experimental - **this is work in progress**.

- [x] [NIP-1](https://github.com/nostr-protocol/nips/blob/master/01.md)
- [x] [NIP-6](https://github.com/nostr-protocol/nips/blob/master/06.md)
- [x] [NIP-9](https://github.com/nostr-protocol/nips/blob/master/09.md)
- [x] [NIP-10](https://github.com/nostr-protocol/nips/blob/master/10.md)
- [x] [NIP-13](https://github.com/nostr-protocol/nips/blob/master/13.md)
- [x] [NIP-24](https://github.com/nostr-protocol/nips/blob/master/24.md)
- [x] [NIP-40](https://github.com/nostr-protocol/nips/blob/master/40.md)

Planned:
- [ ] [NIP-11](https://github.com/nostr-protocol/nips/blob/master/11.md)
- [ ] [NIP-19](https://github.com/nostr-protocol/nips/blob/master/19.md)
- [ ] [NIP-38](https://github.com/nostr-protocol/nips/blob/master/38.md)
- [ ] [NIP-45](https://github.com/nostr-protocol/nips/blob/master/45.md)


### Examples
[This project contains various examples](examples/) that are stand-alone applications showing basic usage of the functionality provided.

| Application                                                | Description                                                                      |
|------------------------------------------------------------|----------------------------------------------------------------------------------|
| [nostr-client](nostr-client-example-application/readme.md) | A simple Nostr client example application that subscribes to all kind `1` notes. |
| [nostr-relay](nostr-relay-example-application/readme.md)   | A simple Nostr relay example application.                                        |
| [nostr-shell](nostr-shell-example-application/readme.md)   | A simple Nostr shell example application, e.g. to "mine" notes (NIP-13).         |

### Requirements
- Java >= 21
- Docker

### Build
```shell script
./gradlew build -x test
```

### Test
```shell script
./gradlew test integrationTest --rerun-tasks --no-parallel
```

Run full test suite (including load tests):
```shell script
CI=true ./gradlew test integrationTest --rerun-tasks --no-parallel
```

### Resources
[Nostr (GitHub)](https://github.com/nostr-protocol/nostr)\
[NIPs (GitHub)](https://github.com/nostr-protocol/nips)\
[nostr.com](https://nostr.com)\
[awesome-nostr (GitHub)](https://github.com/aljazceru/awesome-nostr)\
[Protocol Buffers](https://developers.google.com/protocol-buffers/docs/proto3#json)