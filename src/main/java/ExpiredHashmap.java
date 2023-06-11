import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public class ExpiredHashmap {
    public static void main(String[] args) throws InterruptedException {
        int expiryInMills = 10000;
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .expireAfterWrite(expiryInMills, TimeUnit.MILLISECONDS)
                .build(
                        new CacheLoader<String, Integer>() {
                            public Integer load(String key) {
                                return 1;
                            }
                        });
        for (int i = 0; i < 10; i++) {
            cache.put(String.valueOf(i), i);
            System.out.println(cache.asMap().keySet());
//            Thread.sleep(500);
        }
    }
}
