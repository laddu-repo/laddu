package okhttp3.internal;

import a2.e0;
import af.c;
import bg.b;
import bg.b0;
import bg.j0;
import bg.l0;
import bg.n;
import df.k;
import df.m;
import he.p;
import ie.j;
import ie.r;
import ie.s;
import ie.v;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.z;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import ve.a;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final b0 UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final k VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        n nVar = n.A;
        UNICODE_BOMS = b.h(l.t("efbbbf"), l.t("feff"), l.t("fffe"), l.t("0000ffff"), l.t("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.k.b(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new k("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        okHttpName = m.Y(m.X(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e10) {
        kotlin.jvm.internal.k.e(list, "<this>");
        if (!list.contains(e10)) {
            list.add(e10);
        }
    }

    public static final int and(byte b10, int i6) {
        return b10 & i6;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        kotlin.jvm.internal.k.e(eventListener, "<this>");
        return new e0(eventListener, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener this_asFactory, Call it) {
        kotlin.jvm.internal.k.e(this_asFactory, "$this_asFactory");
        kotlin.jvm.internal.k.e(it, "it");
        return this_asFactory;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        kotlin.jvm.internal.k.e(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        kotlin.jvm.internal.k.e(obj, "<this>");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
        }
    }

    public static final boolean canParseAsIpAddress(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.c(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl other) {
        kotlin.jvm.internal.k.e(httpUrl, "<this>");
        kotlin.jvm.internal.k.e(other, "other");
        if (kotlin.jvm.internal.k.a(httpUrl.host(), other.host()) && httpUrl.port() == other.port() && kotlin.jvm.internal.k.a(httpUrl.scheme(), other.scheme())) {
            return true;
        }
        return false;
    }

    public static final int checkDuration(String name, long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.k.e(name, "name");
        if (j >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis == 0 && j > 0) {
                        throw new IllegalArgumentException(name.concat(" too small.").toString());
                    }
                    return (int) millis;
                }
                throw new IllegalArgumentException(name.concat(" too large.").toString());
            }
            throw new IllegalStateException("unit == null");
        }
        throw new IllegalStateException(name.concat(" < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j && j - j10 >= j11) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        kotlin.jvm.internal.k.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String value) {
        kotlin.jvm.internal.k.e(strArr, "<this>");
        kotlin.jvm.internal.k.e(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[strArr2.length - 1] = value;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String delimiters, int i6, int i10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(delimiters, "delimiters");
        while (i6 < i10) {
            if (m.J(delimiters, str.charAt(i6))) {
                return i6;
            }
            i6++;
        }
        return i10;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i6, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return delimiterOffset(str, str2, i6, i10);
    }

    public static final boolean discard(l0 l0Var, int i6, TimeUnit timeUnit) {
        kotlin.jvm.internal.k.e(l0Var, "<this>");
        kotlin.jvm.internal.k.e(timeUnit, "timeUnit");
        try {
            return skipAll(l0Var, i6, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, ve.l predicate) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        kotlin.jvm.internal.k.e(predicate, "predicate");
        ArrayList arrayList = r.f6846x;
        for (T t10 : iterable) {
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                z.a(arrayList).add(t10);
            }
        }
        return arrayList;
    }

    public static final String format(String format, Object... args) {
        kotlin.jvm.internal.k.e(format, "format");
        kotlin.jvm.internal.k.e(args, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        kotlin.jvm.internal.k.e(strArr, "<this>");
        kotlin.jvm.internal.k.e(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                p e10 = z.e(strArr2);
                while (e10.hasNext()) {
                    if (comparator.compare(str, (String) e10.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        kotlin.jvm.internal.k.e(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return toLongOrDefault(str, -1L);
    }

    public static final void ignoreIoExceptions(a block) {
        kotlin.jvm.internal.k.e(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(ie.k.t(Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.k.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String value, Comparator<String> comparator) {
        kotlin.jvm.internal.k.e(strArr, "<this>");
        kotlin.jvm.internal.k.e(value, "value");
        kotlin.jvm.internal.k.e(comparator, "comparator");
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (comparator.compare(strArr[i6], value) == 0) {
                return i6;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (kotlin.jvm.internal.k.g(charAt, 31) <= 0 || kotlin.jvm.internal.k.g(charAt, 127) >= 0) {
                return i6;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i6, int i10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        while (i6 < i10) {
            char charAt = str.charAt(i6);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i6++;
            } else {
                return i6;
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i6, i10);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i6, int i10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        int i11 = i10 - 1;
        if (i6 <= i11) {
            while (true) {
                char charAt = str.charAt(i11);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i11 == i6) {
                        break;
                    }
                    i11--;
                } else {
                    return i11 + 1;
                }
            }
        }
        return i6;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i6, i10);
    }

    public static final int indexOfNonWhitespace(String str, int i6) {
        kotlin.jvm.internal.k.e(str, "<this>");
        int length = str.length();
        while (i6 < length) {
            char charAt = str.charAt(i6);
            if (charAt != ' ' && charAt != '\t') {
                return i6;
            }
            i6++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 0;
        }
        return indexOfNonWhitespace(str, i6);
    }

    public static final String[] intersect(String[] strArr, String[] other, Comparator<? super String> comparator) {
        kotlin.jvm.internal.k.e(strArr, "<this>");
        kotlin.jvm.internal.k.e(other, "other");
        kotlin.jvm.internal.k.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i6]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i6++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        kotlin.jvm.internal.k.e(fileSystem, "<this>");
        kotlin.jvm.internal.k.e(file, "file");
        j0 sink = fileSystem.sink(file);
        try {
            fileSystem.delete(file);
            jb.b.j(sink, null);
            return true;
        } catch (IOException unused) {
            jb.b.j(sink, null);
            fileSystem.delete(file);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jb.b.j(sink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, bg.m source) {
        kotlin.jvm.internal.k.e(socket, "<this>");
        kotlin.jvm.internal.k.e(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.r();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        if (!name.equalsIgnoreCase("Authorization") && !name.equalsIgnoreCase("Cookie") && !name.equalsIgnoreCase("Proxy-Authorization") && !name.equalsIgnoreCase("Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final void notify(Object obj) {
        kotlin.jvm.internal.k.e(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        kotlin.jvm.internal.k.e(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        return -1;
    }

    public static final String peerName(Socket socket) {
        kotlin.jvm.internal.k.e(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            kotlin.jvm.internal.k.d(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    public static final Charset readBomAsCharset(bg.m mVar, Charset charset) {
        kotlin.jvm.internal.k.e(mVar, "<this>");
        kotlin.jvm.internal.k.e(charset, "default");
        int w10 = mVar.w(UNICODE_BOMS);
        if (w10 != -1) {
            if (w10 != 0) {
                if (w10 != 1) {
                    if (w10 != 2) {
                        if (w10 != 3) {
                            if (w10 == 4) {
                                Charset charset2 = df.a.f4115a;
                                Charset charset3 = df.a.f4117c;
                                if (charset3 == null) {
                                    Charset forName = Charset.forName("UTF-32LE");
                                    kotlin.jvm.internal.k.d(forName, "forName(...)");
                                    df.a.f4117c = forName;
                                    return forName;
                                }
                                return charset3;
                            }
                            throw new AssertionError();
                        }
                        Charset charset4 = df.a.f4115a;
                        Charset charset5 = df.a.f4118d;
                        if (charset5 == null) {
                            Charset forName2 = Charset.forName("UTF-32BE");
                            kotlin.jvm.internal.k.d(forName2, "forName(...)");
                            df.a.f4118d = forName2;
                            return forName2;
                        }
                        return charset5;
                    }
                    Charset UTF_16LE = StandardCharsets.UTF_16LE;
                    kotlin.jvm.internal.k.d(UTF_16LE, "UTF_16LE");
                    return UTF_16LE;
                }
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                kotlin.jvm.internal.k.d(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.k.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        return charset;
    }

    public static final <T> T readFieldOrNull(Object instance, Class<T> fieldType, String fieldName) {
        T t10;
        Object readFieldOrNull;
        kotlin.jvm.internal.k.e(instance, "instance");
        kotlin.jvm.internal.k.e(fieldType, "fieldType");
        kotlin.jvm.internal.k.e(fieldName, "fieldName");
        Class<?> cls = instance.getClass();
        while (true) {
            t10 = null;
            if (!cls.equals(Object.class)) {
                try {
                    Field declaredField = cls.getDeclaredField(fieldName);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(instance);
                    if (!fieldType.isInstance(obj)) {
                        break;
                    }
                    t10 = fieldType.cast(obj);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                    kotlin.jvm.internal.k.d(cls, "c.superclass");
                }
            } else {
                if (fieldName.equals("delegate") || (readFieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, fieldType, fieldName);
            }
        }
        return t10;
    }

    public static final int readMedium(bg.m mVar) {
        kotlin.jvm.internal.k.e(mVar, "<this>");
        return and(mVar.readByte(), 255) | (and(mVar.readByte(), 255) << 16) | (and(mVar.readByte(), 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, bg.k] */
    public static final boolean skipAll(l0 l0Var, int i6, TimeUnit timeUnit) {
        kotlin.jvm.internal.k.e(l0Var, "<this>");
        kotlin.jvm.internal.k.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = l0Var.timeout().hasDeadline() ? l0Var.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        l0Var.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i6)) + nanoTime);
        try {
            ?? obj = new Object();
            while (l0Var.read(obj, 8192L) != -1) {
                obj.d();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                l0Var.timeout().clearDeadline();
                return true;
            }
            l0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                l0Var.timeout().clearDeadline();
                return false;
            }
            l0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                l0Var.timeout().clearDeadline();
            } else {
                l0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String name, final boolean z10) {
        kotlin.jvm.internal.k.e(name, "name");
        return new ThreadFactory() { // from class: ag.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadFactory$lambda$1;
                threadFactory$lambda$1 = Util.threadFactory$lambda$1(name, z10, runnable);
                return threadFactory$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String name, boolean z10, Runnable runnable) {
        kotlin.jvm.internal.k.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final void threadName(String name, a block) {
        kotlin.jvm.internal.k.e(name, "name");
        kotlin.jvm.internal.k.e(block, "block");
        Thread currentThread = Thread.currentThread();
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            currentThread.setName(name2);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        kotlin.jvm.internal.k.e(headers, "<this>");
        c w10 = android.support.v4.media.session.b.w(0, headers.size());
        ArrayList arrayList = new ArrayList(ie.l.x(w10, 10));
        Iterator it = w10.iterator();
        while (it.hasNext()) {
            int nextInt = ((v) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().q(), header.component2().q());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        kotlin.jvm.internal.k.d(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z10) {
        String host;
        kotlin.jvm.internal.k.e(httpUrl, "<this>");
        if (m.I(httpUrl.host(), ":", false)) {
            host = "[" + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z10 && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = false;
        }
        return toHostHeader(httpUrl, z10);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(j.a0(list));
        kotlin.jvm.internal.k.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        kotlin.jvm.internal.k.e(map, "<this>");
        if (map.isEmpty()) {
            return s.f6847x;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        kotlin.jvm.internal.k.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        kotlin.jvm.internal.k.e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i6) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
                return i6;
            }
        }
        return i6;
    }

    public static final String trimSubstring(String str, int i6, int i10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i6, i10);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i10));
        kotlin.jvm.internal.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return trimSubstring(str, i6, i10);
    }

    public static final void wait(Object obj) {
        kotlin.jvm.internal.k.e(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> suppressed) {
        kotlin.jvm.internal.k.e(exc, "<this>");
        kotlin.jvm.internal.k.e(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            he.a.a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(bg.l lVar, int i6) {
        kotlin.jvm.internal.k.e(lVar, "<this>");
        lVar.writeByte((i6 >>> 16) & 255);
        lVar.writeByte((i6 >>> 8) & 255);
        lVar.writeByte(i6 & 255);
    }

    public static final int and(short s, int i6) {
        return s & i6;
    }

    public static final int delimiterOffset(String str, char c10, int i6, int i10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        while (i6 < i10) {
            if (str.charAt(i6) == c10) {
                return i6;
            }
            i6++;
        }
        return i10;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i6, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return delimiterOffset(str, c10, i6, i10);
    }

    public static final String toHexString(int i6) {
        String hexString = Integer.toHexString(i6);
        kotlin.jvm.internal.k.d(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i6, long j) {
        return j & i6;
    }

    public static final void closeQuietly(Socket socket) {
        kotlin.jvm.internal.k.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!kotlin.jvm.internal.k.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        kotlin.jvm.internal.k.e(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(bg.k kVar, byte b10) {
        kotlin.jvm.internal.k.e(kVar, "<this>");
        int i6 = 0;
        while (!kVar.r() && kVar.y(0L) == b10) {
            i6++;
            kVar.readByte();
        }
        return i6;
    }
}
