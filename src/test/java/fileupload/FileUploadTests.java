package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\USER\\Pictures\\Screenshots\\Screenshot (4).png");
        assertEquals(uploadPage.getUploadedFiles(), "Screenshot (4).png");
    }
}
