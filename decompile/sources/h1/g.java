package h1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import bf.y;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f5846a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f5847b;

    /* renamed from: c, reason: collision with root package name */
    public int f5848c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f5849d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f5850e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f5851f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5852g;

    /* renamed from: h, reason: collision with root package name */
    public int f5853h;

    /* renamed from: i, reason: collision with root package name */
    public int f5854i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f5855k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f5832l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final List f5833m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List f5834n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f5835o = {8, 8, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f5836p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f5837q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f5838r = {102, 116, 121, 112};
    public static final byte[] s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f5839t = {104, 101, 105, 99};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f5840u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f5841v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f5842w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f5843x = {101, 88, 73, 102};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f5844y = {73, 72, 68, 82};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f5845z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{HttpUrl.FRAGMENT_ENCODE_SET, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i6 = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i6 < dVarArr6.length) {
                J[i6] = new HashMap();
                K[i6] = new HashMap();
                for (d dVar : dVarArr6[i6]) {
                    J[i6].put(Integer.valueOf(dVar.f5826a), dVar);
                    K[i6].put(dVar.f5827b, dVar);
                }
                i6++;
            } else {
                HashMap hashMap = M;
                d[] dVarArr7 = I;
                hashMap.put(Integer.valueOf(dVarArr7[0].f5826a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f5826a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f5826a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f5826a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f5826a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f5826a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005f, blocks: (B:6:0x0050, B:8:0x0053, B:10:0x0068, B:16:0x0085, B:18:0x0090, B:19:0x00a6, B:28:0x0097, B:31:0x009f, B:32:0x00a3, B:33:0x00b0, B:35:0x00b9, B:37:0x00bf, B:39:0x00c5, B:41:0x00cb, B:51:0x00d9), top: B:5:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.io.InputStream r10) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.<init>(java.io.InputStream):void");
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z10 = f5832l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z10) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f5849d;
        if (b10 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b10.concat("\u0000").getBytes(N);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f5851f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f5851f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f5851f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f5851f));
        }
    }

    public final String b(String str) {
        c c10 = c(str);
        if (c10 != null) {
            int i6 = c10.f5822a;
            if (!L.contains(str)) {
                return c10.f(this.f5851f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i6 != 5 && i6 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i6);
                    return null;
                }
                e[] eVarArr = (e[]) c10.g(this.f5851f);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) eVar.f5830a) / ((float) eVar.f5831b)));
                    e eVar2 = eVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f5830a) / ((float) eVar2.f5831b)));
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f5830a) / ((float) eVar3.f5831b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(c10.d(this.f5851f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f5832l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i6 = 0; i6 < H.length; i6++) {
            c cVar = (c) this.f5849d[i6].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) {
        String str;
        String str2;
        String str3;
        int i6;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    i.a(mediaMetadataRetriever, new a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.f5849d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f5851f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str2), this.f5851f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i6 = 1;
                                } else {
                                    i6 = 8;
                                }
                            } else {
                                i6 = 3;
                            }
                        } else {
                            i6 = 6;
                        }
                        hashMapArr[0].put("Orientation", c.c(i6, this.f5851f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.f(parseInt2);
                            byte[] bArr = new byte[6];
                            fVar.readFully(bArr);
                            int i10 = parseInt2 + 6;
                            int i11 = parseInt3 - 6;
                            if (Arrays.equals(bArr, O)) {
                                byte[] bArr2 = new byte[i11];
                                fVar.readFully(bArr2);
                                this.f5853h = i10;
                                r(0, bArr2);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f5832l) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0183 A[LOOP:0: B:9:0x0034->B:32:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(h1.b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.e(h1.b, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:14|15|16|17|(2:18|19)|(16:107|(2:109|110)(1:153)|112|113|(1:115)|116|(4:119|120|(7:124|125|126|(3:128|(1:130)(2:139|(1:141))|(3:133|134|135))(1:142)|137|121|122)|145)|118|22|23|25|26|27|(1:93)(1:31)|32|(1:34)(8:36|37|39|40|41|(1:43)(1:79)|44|(1:46)(3:47|(2:48|(2:50|(2:53|54)(1:52))(2:77|78))|(1:56)(3:57|(2:58|(2:60|(1:63)(1:62))(3:68|69|(2:70|(1:76)(2:72|(1:75)(1:74)))))|(1:66)(1:67)))))|21|22|23|25|26|27|(1:29)|93|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ef, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f9, code lost:
    
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00fb, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00fe, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f6, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00ca, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0165, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0101, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0104, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) {
        int i6;
        int i10;
        j(fVar);
        HashMap[] hashMapArr = this.f5849d;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f5825d);
            fVar2.f5821z = this.f5851f;
            byte[] bArr = f5840u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.f(0L);
            byte[] bArr3 = f5841v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.f(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f5851f);
                if (iArr != null && iArr.length == 4) {
                    int i11 = iArr[2];
                    int i12 = iArr[0];
                    if (i11 > i12 && (i6 = iArr[3]) > (i10 = iArr[1])) {
                        int i13 = (i11 - i12) + 1;
                        int i14 = (i6 - i10) + 1;
                        if (i13 < i14) {
                            int i15 = i13 + i14;
                            i14 = i15 - i14;
                            i13 = i15 - i14;
                        }
                        c c10 = c.c(i13, this.f5851f);
                        c c11 = c.c(i14, this.f5851f);
                        hashMapArr[0].put("ImageWidth", c10);
                        hashMapArr[0].put("ImageLength", c11);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(b bVar) {
        if (f5832l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f5821z = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f5842w;
        bVar.d(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i6 = length + 8;
                if (i6 == 16 && !Arrays.equals(bArr2, f5844y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f5845z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f5843x)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f5853h = i6;
                        r(0, bArr3);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i10 = readInt + 4;
                bVar.d(i10);
                length = i6 + i10;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        boolean z10 = f5832l;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i6 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.d(i6 - bVar.f5820y);
        bVar.readFully(bArr4);
        e(new b(bArr4), i6, 5);
        bVar.d(i11 - bVar.f5820y);
        bVar.f5821z = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == G.f5826a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c10 = c.c(readShort, this.f5851f);
                c c11 = c.c(readShort2, this.f5851f);
                HashMap[] hashMapArr = this.f5849d;
                hashMapArr[0].put("ImageLength", c10);
                hashMapArr[0].put("ImageWidth", c11);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.d(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f5848c == 8) {
            HashMap[] hashMapArr = this.f5849d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f5825d);
                fVar2.f5821z = this.f5851f;
                fVar2.d(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f5832l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f5849d;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f5825d), (int) cVar.f5824c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void l(b bVar) {
        if (f5832l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f5821z = ByteOrder.LITTLE_ENDIAN;
        bVar.d(A.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i6 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f5853h = i6;
                    r(0, bArr3);
                    u(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i6 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    bVar.d(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int e10 = cVar.e(this.f5851f);
            int e11 = cVar2.e(this.f5851f);
            if (this.f5848c == 7) {
                e10 += this.f5854i;
            }
            if (e10 > 0 && e11 > 0 && this.f5847b == null && this.f5846a == null) {
                bVar.d(e10);
                bVar.readFully(new byte[e11]);
            }
            if (f5832l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e10 + ", length: " + e11);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int e10 = cVar.e(this.f5851f);
            int e11 = cVar2.e(this.f5851f);
            if (e10 <= 512 && e11 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(f fVar) {
        ByteOrder q9 = q(fVar);
        this.f5851f = q9;
        fVar.f5821z = q9;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i6 = this.f5848c;
        if (i6 != 7 && i6 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt >= 8) {
            int i10 = readInt - 8;
            if (i10 > 0) {
                fVar.d(i10);
                return;
            }
            return;
        }
        throw new IOException(h8.c.i(readInt, "Invalid first Ifd offset: "));
    }

    public final void p() {
        int i6 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f5849d;
            if (i6 < hashMapArr.length) {
                StringBuilder n10 = h8.c.n(i6, "The size of tag group[", "]: ");
                n10.append(hashMapArr[i6].size());
                Log.d("ExifInterface", n10.toString());
                for (Map.Entry entry : hashMapArr[i6].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f5851f) + "'");
                }
                i6++;
            } else {
                return;
            }
        }
    }

    public final void r(int i6, byte[] bArr) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(h1.f r36, int r37) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.s(h1.f, int):void");
    }

    public final void t(int i6, String str, String str2) {
        HashMap[] hashMapArr = this.f5849d;
        if (!hashMapArr[i6].isEmpty() && hashMapArr[i6].get(str) != null) {
            HashMap hashMap = hashMapArr[i6];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i6].remove(str);
        }
    }

    public final void u(b bVar) {
        c cVar;
        int e10;
        HashMap hashMap = this.f5849d[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 != null) {
            int e11 = cVar2.e(this.f5851f);
            if (e11 != 1) {
                if (e11 != 6) {
                    if (e11 != 7) {
                        return;
                    }
                } else {
                    m(bVar, hashMap);
                    return;
                }
            }
            c cVar3 = (c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.g(this.f5851f);
                int[] iArr2 = f5835o;
                if (Arrays.equals(iArr2, iArr) || (this.f5848c == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e10 = cVar.e(this.f5851f)) == 1 && Arrays.equals(iArr, f5836p)) || (e10 == 6 && Arrays.equals(iArr, iArr2))))) {
                    c cVar4 = (c) hashMap.get("StripOffsets");
                    c cVar5 = (c) hashMap.get("StripByteCounts");
                    if (cVar4 != null && cVar5 != null) {
                        long[] i6 = y.i(cVar4.g(this.f5851f));
                        long[] i10 = y.i(cVar5.g(this.f5851f));
                        if (i6 != null && i6.length != 0) {
                            if (i10 != null && i10.length != 0) {
                                if (i6.length != i10.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j = 0;
                                for (long j10 : i10) {
                                    j += j10;
                                }
                                byte[] bArr = new byte[(int) j];
                                this.f5852g = true;
                                int i11 = 0;
                                int i12 = 0;
                                for (int i13 = 0; i13 < i6.length; i13++) {
                                    int i14 = (int) i6[i13];
                                    int i15 = (int) i10[i13];
                                    if (i13 < i6.length - 1 && i14 + i15 != i6[i13 + 1]) {
                                        this.f5852g = false;
                                    }
                                    int i16 = i14 - i11;
                                    if (i16 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    try {
                                        bVar.d(i16);
                                        int i17 = i11 + i16;
                                        byte[] bArr2 = new byte[i15];
                                        try {
                                            bVar.readFully(bArr2);
                                            i11 = i17 + i15;
                                            System.arraycopy(bArr2, 0, bArr, i12, i15);
                                            i12 += i15;
                                        } catch (EOFException unused) {
                                            Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                                        return;
                                    }
                                }
                                if (this.f5852g) {
                                    long j11 = i6[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (f5832l) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(bVar, hashMap);
    }

    public final void v(int i6, int i10) {
        HashMap[] hashMapArr = this.f5849d;
        boolean isEmpty = hashMapArr[i6].isEmpty();
        boolean z10 = f5832l;
        if (!isEmpty && !hashMapArr[i10].isEmpty()) {
            c cVar = (c) hashMapArr[i6].get("ImageLength");
            c cVar2 = (c) hashMapArr[i6].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i10].get("ImageLength");
            c cVar4 = (c) hashMapArr[i10].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int e10 = cVar.e(this.f5851f);
                    int e11 = cVar2.e(this.f5851f);
                    int e12 = cVar3.e(this.f5851f);
                    int e13 = cVar4.e(this.f5851f);
                    if (e10 < e12 && e11 < e13) {
                        HashMap hashMap = hashMapArr[i6];
                        hashMapArr[i6] = hashMapArr[i10];
                        hashMapArr[i10] = hashMap;
                        return;
                    }
                    return;
                }
                if (z10) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(f fVar, int i6) {
        c c10;
        c c11;
        HashMap[] hashMapArr = this.f5849d;
        c cVar = (c) hashMapArr[i6].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i6].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i6].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i6].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i6].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f5822a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f5851f);
                if (eVarArr != null && eVarArr.length == 2) {
                    c10 = c.b(eVarArr[0], this.f5851f);
                    c11 = c.b(eVarArr[1], this.f5851f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.g(this.f5851f);
                if (iArr != null && iArr.length == 2) {
                    c10 = c.c(iArr[0], this.f5851f);
                    c11 = c.c(iArr[1], this.f5851f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i6].put("ImageWidth", c10);
            hashMapArr[i6].put("ImageLength", c11);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e10 = cVar2.e(this.f5851f);
            int e11 = cVar4.e(this.f5851f);
            int e12 = cVar5.e(this.f5851f);
            int e13 = cVar3.e(this.f5851f);
            if (e11 > e10 && e12 > e13) {
                c c12 = c.c(e11 - e10, this.f5851f);
                c c13 = c.c(e12 - e13, this.f5851f);
                hashMapArr[i6].put("ImageLength", c12);
                hashMapArr[i6].put("ImageWidth", c13);
                return;
            }
            return;
        }
        c cVar6 = (c) hashMapArr[i6].get("ImageLength");
        c cVar7 = (c) hashMapArr[i6].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i6].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i6].get("JPEGInterchangeFormatLength");
            if (cVar8 != null && cVar9 != null) {
                int e14 = cVar8.e(this.f5851f);
                int e15 = cVar8.e(this.f5851f);
                fVar.f(e14);
                byte[] bArr = new byte[e15];
                fVar.readFully(bArr);
                e(new b(bArr), e14, i6);
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f5849d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
