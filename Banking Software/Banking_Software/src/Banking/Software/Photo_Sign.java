//package Banking.Software;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.bytedeco.javacv.*;
//import org.bytedeco.javacv.OpenCVFrameConverter;
//import org.bytedeco.opencv.opencv_core.Mat;
//import org.bytedeco.opencv.opencv_imgcodecs;
//
//
//    public class ImageUploader extends JFrame implements ActionListener {
//        private JButton uploadPhotoButton, uploadSignatureButton, viewPhotoButton;
//        private JLabel imageLabel;
//        private String photoPath;
//
//        public ImageUploader() {
//            setTitle("Image and Signature Uploader");
//            setLayout(new FlowLayout());
//            setSize(400, 400);
//            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            uploadPhotoButton = new JButton("Upload Photo");
//            uploadSignatureButton = new JButton("Upload Signature");
//            viewPhotoButton = new JButton("See Photo");
//            imageLabel = new JLabel();
//
//            uploadPhotoButton.addActionListener(this);
//            uploadSignatureButton.addActionListener(this);
//            viewPhotoButton.addActionListener(this);
//
//            add(uploadPhotoButton);
//            add(uploadSignatureButton);
//            add(viewPhotoButton);
//            add(imageLabel);
//
//            setVisible(true);
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (e.getSource() == uploadPhotoButton) {
//                capturePhoto();
//            } else if (e.getSource() == uploadSignatureButton) {
//                // Similar logic for signature can be added here
//            } else if (e.getSource() == viewPhotoButton) {
//                if (photoPath != null) {
//                    showPhoto();
//                } else {
//                    JOptionPane.showMessageDialog(this, "No photo uploaded.");
//                }
//            }
//        }
//
//        private void capturePhoto() {
//            // Open the camera
//            try (OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0)) {
//                grabber.start();
//                Frame frame;
//
//                // Create a window to display the camera feed
//                JFrame cameraFrame = new JFrame("Camera");
//                cameraFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                cameraFrame.setSize(640, 480);
//                cameraFrame.setLayout(new BorderLayout());
//                JLabel cameraLabel = new JLabel();
//                cameraFrame.add(cameraLabel, BorderLayout.CENTER);
//                cameraFrame.setVisible(true);
//
//                while (true) {
//                    // Grab a frame
//                    frame = grabber.grab();
//                    if (frame == null) break;
//
//                    // Convert the frame to a Mat
//                    OpenCVFrameConverter.ToMat converter = new OpenCVFrameConverter.ToMat();
//                    Mat mat = converter.convert(frame);
//
//                    // Display the frame in the JLabel
//                    ImageIcon imageIcon = new ImageIcon(mat.getBufferedImage());
//                    cameraLabel.setIcon(imageIcon);
//
//                    // Check for photo capture (pressing a key)
////                    if (/* Condition for capturing the photo, e.g., a button or key press */) {
////                        String outputFile = "captured_photo.png";
////                        opencv_imgcodecs.imwrite(outputFile, mat);
////                        photoPath = outputFile;
////                        JOptionPane.showMessageDialog(this, "Photo captured and saved as " + outputFile);
////                        break;
////                    }
//
//                    // Add a small delay
//                    Thread.sleep(30);
//                }
//
//                grabber.stop();
//                cameraFrame.dispose();
//            } catch (Exception ex) {
//                ex.printStackTrace();
//                JOptionPane.showMessageDialog(this, "Error accessing camera: " + ex.getMessage());
//            }
//        }
//
//        private void showPhoto() {
//            String url = "jdbc:mysql://localhost:3306/your_database"; // Update your DB URL
//            String username = "your_username"; // Update your DB username
//            String password = "your_password"; // Update your DB password
//            String sql = "SELECT photo FROM UserImages WHERE name = ?"; // Adjust query as needed
//
//            try (Connection conn = DriverManager.getConnection(url, username, password);
//                 PreparedStatement statement = conn.prepareStatement(sql)) {
//                statement.setString(1, new File(photoPath).getName());
//                ResultSet resultSet = statement.executeQuery();
//
//                if (resultSet.next()) {
//                    byte[] imgBytes = resultSet.getBytes("photo");
//                    ImageIcon imageIcon = new ImageIcon(imgBytes);
//                    imageLabel.setIcon(imageIcon);
//                    imageLabel.setText("");
//                } else {
//                    JOptionPane.showMessageDialog(this, "No photo found for this name.");
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                JOptionPane.showMessageDialog(this, "Error retrieving photo: " + ex.getMessage());
//            }
//        }
//
//        public static void main(String[] args) {
//            new ImageUploader();
//        }
//    }
//
//
//
