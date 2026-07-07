package okhttp3.internal.http2;

import bg.b;
import bg.l0;
import bg.m;
import bg.n;
import com.unity3d.services.core.network.model.HttpRequest;
import ie.i;
import ie.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<n, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final m source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(l0 source, int i6) {
            this(source, i6, 0, 4, null);
            k.e(source, "source");
        }

        private final void adjustDynamicTableByteCount() {
            int i6 = this.maxDynamicTableByteCount;
            int i10 = this.dynamicTableByteCount;
            if (i6 < i10) {
                if (i6 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i10 - i6);
                }
            }
        }

        private final void clearDynamicTable() {
            i.i0(r0, null, 0, this.dynamicTable.length);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i6) {
            return this.nextHeaderIndex + 1 + i6;
        }

        private final int evictToRecoverBytes(int i6) {
            int i10;
            int i11 = 0;
            if (i6 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || i6 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    k.b(header);
                    int i12 = header.hpackSize;
                    i6 -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final n getName(int i6) {
            if (isStaticHeader(i6)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i6].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i6 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    k.b(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i6 + 1));
        }

        private final void insertIntoDynamicTable(int i6, Header header) {
            this.headerList.add(header);
            int i10 = header.hpackSize;
            if (i6 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i6)];
                k.b(header2);
                i10 -= header2.hpackSize;
            }
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i10) - i11);
            if (i6 == -1) {
                int i12 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i12 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i13 = this.nextHeaderIndex;
                this.nextHeaderIndex = i13 - 1;
                this.dynamicTable[i13] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i6) + evictToRecoverBytes + i6] = header;
            }
            this.dynamicTableByteCount += i10;
        }

        private final boolean isStaticHeader(int i6) {
            if (i6 >= 0 && i6 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1) {
                return true;
            }
            return false;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i6) {
            if (isStaticHeader(i6)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i6]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i6 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    k.b(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i6 + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i6) {
            insertIntoDynamicTable(-1, new Header(getName(i6), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i6) {
            this.headerList.add(new Header(getName(i6), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> Z = j.Z(this.headerList);
            this.headerList.clear();
            return Z;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, bg.k, bg.l] */
        public final n readByteString() {
            boolean z10;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            long readInt = readInt(readByte, 127);
            if (z10) {
                ?? obj = new Object();
                Huffman.INSTANCE.decode(this.source, readInt, obj);
                return obj.g(obj.f1726y);
            }
            return this.source.g(readInt);
        }

        public final void readHeaders() {
            while (!this.source.r()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and != 128) {
                    if ((and & 128) == 128) {
                        readIndexedHeader(readInt(and, 127) - 1);
                    } else if (and == 64) {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    } else if ((and & 64) == 64) {
                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, Hpack.PREFIX_6_BITS) - 1);
                    } else if ((and & 32) == 32) {
                        int readInt = readInt(and, Hpack.PREFIX_5_BITS);
                        this.maxDynamicTableByteCount = readInt;
                        if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                            adjustDynamicTableByteCount();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                        }
                    } else if (and != 16 && and != 0) {
                        readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                    } else {
                        readLiteralHeaderWithoutIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        public final int readInt(int i6, int i10) {
            int i11 = i6 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) != 0) {
                    i10 += (readByte & 127) << i12;
                    i12 += 7;
                } else {
                    return i10 + (readByte << i12);
                }
            }
        }

        public Reader(l0 source, int i6, int i10) {
            k.e(source, "source");
            this.headerTableSizeSetting = i6;
            this.maxDynamicTableByteCount = i10;
            this.headerList = new ArrayList();
            this.source = b.d(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ Reader(l0 l0Var, int i6, int i10, int i11, f fVar) {
            this(l0Var, i6, (i11 & 4) != 0 ? i6 : i10);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final bg.k out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i6, bg.k out) {
            this(i6, false, out, 2, null);
            k.e(out, "out");
        }

        private final void adjustDynamicTableByteCount() {
            int i6 = this.maxDynamicTableByteCount;
            int i10 = this.dynamicTableByteCount;
            if (i6 < i10) {
                if (i6 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i10 - i6);
                }
            }
        }

        private final void clearDynamicTable() {
            i.i0(r0, null, 0, this.dynamicTable.length);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i6) {
            int i10;
            int i11 = 0;
            if (i6 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || i6 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    k.b(header);
                    i6 -= header.hpackSize;
                    int i12 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    k.b(header2);
                    this.dynamicTableByteCount = i12 - header2.hpackSize;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i6 = header.hpackSize;
            int i10 = this.maxDynamicTableByteCount;
            if (i6 > i10) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i6) - i10);
            int i11 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i11 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i12 = this.nextHeaderIndex;
            this.nextHeaderIndex = i12 - 1;
            this.dynamicTable[i12] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i6;
        }

        public final void resizeHeaderTable(int i6) {
            this.headerTableSizeSetting = i6;
            int min = Math.min(i6, 16384);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == min) {
                return;
            }
            if (min < i10) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, bg.k, bg.l] */
        public final void writeByteString(n data) {
            k.e(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.d()) {
                    ?? obj = new Object();
                    huffman.encode(data, obj);
                    n g10 = obj.g(obj.f1726y);
                    writeInt(g10.d(), 127, 128);
                    this.out.k0(g10);
                    return;
                }
            }
            writeInt(data.d(), 127, 0);
            this.out.k0(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r13) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i6, int i10, int i11) {
            if (i6 < i10) {
                this.out.l0(i6 | i11);
                return;
            }
            this.out.l0(i11 | i10);
            int i12 = i6 - i10;
            while (i12 >= 128) {
                this.out.l0(128 | (i12 & 127));
                i12 >>>= 7;
            }
            this.out.l0(i12);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(bg.k out) {
            this(0, false, out, 3, null);
            k.e(out, "out");
        }

        public Writer(int i6, boolean z10, bg.k out) {
            k.e(out, "out");
            this.headerTableSizeSetting = i6;
            this.useCompression = z10;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i6;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Writer(int i6, boolean z10, bg.k kVar, int i10, f fVar) {
            this((i10 & 1) != 0 ? 4096 : i6, (i10 & 2) != 0 ? true : z10, kVar);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, HttpUrl.FRAGMENT_ENCODE_SET);
        n nVar = Header.TARGET_METHOD;
        Header header2 = new Header(nVar, "GET");
        Header header3 = new Header(nVar, "POST");
        n nVar2 = Header.TARGET_PATH;
        Header header4 = new Header(nVar2, "/");
        Header header5 = new Header(nVar2, "/index.html");
        n nVar3 = Header.TARGET_SCHEME;
        Header header6 = new Header(nVar3, "http");
        Header header7 = new Header(nVar3, HttpRequest.DEFAULT_SCHEME);
        n nVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(nVar4, "200"), new Header(nVar4, "204"), new Header(nVar4, "206"), new Header(nVar4, "304"), new Header(nVar4, "400"), new Header(nVar4, "404"), new Header(nVar4, "500"), new Header("accept-charset", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-ranges", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept", HttpUrl.FRAGMENT_ENCODE_SET), new Header("access-control-allow-origin", HttpUrl.FRAGMENT_ENCODE_SET), new Header("age", HttpUrl.FRAGMENT_ENCODE_SET), new Header("allow", HttpUrl.FRAGMENT_ENCODE_SET), new Header("authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cache-control", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-disposition", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-length", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-type", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("date", HttpUrl.FRAGMENT_ENCODE_SET), new Header("etag", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expect", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expires", HttpUrl.FRAGMENT_ENCODE_SET), new Header("from", HttpUrl.FRAGMENT_ENCODE_SET), new Header("host", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-modified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-none-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-unmodified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("last-modified", HttpUrl.FRAGMENT_ENCODE_SET), new Header("link", HttpUrl.FRAGMENT_ENCODE_SET), new Header("location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("max-forwards", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authenticate", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("referer", HttpUrl.FRAGMENT_ENCODE_SET), new Header("refresh", HttpUrl.FRAGMENT_ENCODE_SET), new Header("retry-after", HttpUrl.FRAGMENT_ENCODE_SET), new Header("server", HttpUrl.FRAGMENT_ENCODE_SET), new Header("set-cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("strict-transport-security", HttpUrl.FRAGMENT_ENCODE_SET), new Header("transfer-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("user-agent", HttpUrl.FRAGMENT_ENCODE_SET), new Header("vary", HttpUrl.FRAGMENT_ENCODE_SET), new Header("via", HttpUrl.FRAGMENT_ENCODE_SET), new Header("www-authenticate", HttpUrl.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<n, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i6].name)) {
                linkedHashMap.put(headerArr2[i6].name, Integer.valueOf(i6));
            }
        }
        Map<n, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.d(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final n checkLowercase(n name) {
        k.e(name, "name");
        int d10 = name.d();
        for (int i6 = 0; i6 < d10; i6++) {
            byte i10 = name.i(i6);
            if (65 <= i10 && i10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.q()));
            }
        }
        return name;
    }

    public final Map<n, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
