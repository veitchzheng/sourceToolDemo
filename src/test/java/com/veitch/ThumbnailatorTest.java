package com.veitch;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import net.coobird.thumbnailator.Thumbnails;

/**
 * Java 图形处理api
 *
 * @author zhengweichao  2018-10-11 下午4:35
 **/
public class ThumbnailatorTest {

    @Test
    public void abc() {

//        ImageEditTest.createStringMark("/Users/zhengweichao/Downloads/poster2.jpg", "试试11😄",
//                "/Users/zhengweichao/Downloads/little.png", "/Users/zhengweichao/Downloads/poster3_after.jpg");
//
//        System.out.println("测试文字".length());
//        System.out.println("测试文字1111😄".length());
//        System.out.println("测试文字1111aaaa;".length());

        String outPath = "/Users/zhengweichao/Downloads/poster3_after.jpg";

        URL iconUrl = null;
        try {
            iconUrl = new URL("https://devres.alphalawyer.cn/paralegalInfo/0bb8fc56-d74e-40f8-ae45-78ecc5435858");
            iconUrl = new URL("https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLYIjS0bxNFZxqCErNs4pMczib06KzeibEMGzicRa43oNsJO9sia3oVlpOyvW9XFvrMEuR80lWbVHBV4A/132");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            Thumbnails.of(iconUrl)
                    .size(128,128)

                    .toFile(outPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
