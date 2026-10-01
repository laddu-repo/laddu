package okhttp3;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class OkHttpUtils {
    public static Headers.Builder addLenient(Headers.Builder builder, String str) {
        return builder.addLenient$okhttp(str);
    }

    public static DiskLruCache diskLruCache(Cache cache) {
        return cache.getCache$okhttp();
    }

    public static Headers.Builder headers(Request.Builder builder) {
        return builder.getHeaders$okhttp();
    }

    public static Map<Class<?>, Object> tags(Request.Builder builder) {
        return builder.getTags$okhttp();
    }

    public static Map<Class<?>, Object> tags(Request request) {
        Map<Class<?>, Object> tags$okhttp = request.getTags$okhttp();
        if (tags$okhttp.isEmpty()) {
            Field declaredField = Request.class.getDeclaredField("tags");
            declaredField.setAccessible(true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            declaredField.set(request, linkedHashMap);
            return linkedHashMap;
        }
        Field declaredField2 = tags$okhttp.getClass().getDeclaredField("m");
        declaredField2.setAccessible(true);
        return (Map) declaredField2.get(tags$okhttp);
    }
}
