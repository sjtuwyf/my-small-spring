package cn.bugstack.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ssqswyf
 * @date 2022/1/27
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
