//package com.example.urlshortner;
//
//import ai.grakn.redismock.RedisServer;
//import com.example.urlshortner.repository.URLRepository;
//import com.fiftyonred.mock_jedis.MockJedis;
//import org.junit.jupiter.api.*;
//import redis.clients.jedis.Jedis;
//
//import java.io.IOException;
//
//
//class UrlShortnerApplicationTests {
//    private Jedis server;
//    @BeforeEach
//    public void setupServer() throws IOException {
////        server = new MockJedis("localhost:8585");
//    }
//
//    @Test
//    public void test_incrementID_StartsAt0AndIncrements() {
//        Jedis j = new MockJedis("redis://localhost:6379");
//        j.set("test", "123");
////        URLRepository urlRepository = new URLRepository(server, "id", "url:");
////        urlRepository.saveUrl("url:123123", "this is a set");
////        for (long expectedId = 0L; expectedId < 50L; ++expectedId) {
////            long actualId = urlRepository.incrementID();
////            System.out.println(expectedId);
//////            assertEquals(expectedId, actualId);
////        }
//    }
//}
