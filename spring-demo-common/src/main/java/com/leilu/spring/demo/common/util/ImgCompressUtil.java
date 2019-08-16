package com.leilu.spring.demo.common.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by leilu on 2019/8/16.
 */
public class ImgCompressUtil {
    private ImgCompressUtil() {
    }

    /**
     * 强制压缩/放大图片到固定的大小.
     *
     * @param compressPercent 压缩比例(压缩为原来一半传0.5)
     * @return BufferedImage bufferImage
     */
    public static BufferedImage resize(File file, double compressPercent) {
        BufferedImage img = null; //原图
        BufferedImage compressImg = null; //压缩后图
        int width;
        int height;
        try {
            img = ImageIO.read(file);
            width = (int) (img.getWidth() * compressPercent);
            height = (int) (img.getHeight() * compressPercent);
            compressImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            compressImg.getGraphics().drawImage(img, 0, 0, width, height, null); // 绘制缩小后的图
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return compressImg;
    }

    public static BufferedImage resize(File file,int width,int height) {
        BufferedImage img = null; //原图
        BufferedImage compressImg = null; //压缩后图
        try {
            img = ImageIO.read(file);
            compressImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            compressImg.getGraphics().drawImage(img, 0, 0, width, height, null); // 绘制缩小后的图
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return compressImg;
    }

}
