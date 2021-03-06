/*
 * Copyright Vincent Blouin under the GPL License version 3
 */

package guru.bubl.module.common_utils;

import java.io.UnsupportedEncodingException;
import java.net.*;

public class Uris {
    public static String encodeURL(String URL) {
        try {
            return URLEncoder.encode(URL, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String encodeURL(URI uri) {
        return encodeURL(uri.toString());
    }

    public static String encodeURL(URL url) {
        return encodeURL(url.toString());
    }

    public static String decodeUrl(String url) {
        try {
            return decodeUrlSafe(
                    url
            );
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static URI decodeUriSafe(URI uri) throws UnsupportedEncodingException {
        return URI.create(
                URLDecoder.decode(
                        uri.toString(),
                        "UTF-8"
                )
        );
    }

    public static String decodeUrlSafe(String url) throws UnsupportedEncodingException {
        return URLDecoder.decode(url, "UTF-8");
    }

    public static URI get(String uri) {
        try {
            return new URI(uri);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
