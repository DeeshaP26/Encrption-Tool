# Encrption-Tool

## Overview
This project is a **Command-Line Interface (CLI) Encryption Tool** that allows users to encrypt and decrypt messages using three different encryption methods:

1. **Caesar Cipher** – A simple substitution cipher that shifts letters by a fixed number of places.
2. **Vigenère Cipher** – A more secure method using a keyword to apply multiple shifts.
3. **AES Encryption** – A modern, highly secure encryption standard.

Users can choose their preferred encryption method and provide the necessary keys or passwords to encrypt and decrypt messages.

## Project Structure
```
EncryptionTool/
├── src/
│   ├── CaesarCipher.java        # Implements the Caesar Cipher
│   ├── VigenereCipher.java      # Implements the Vigenère Cipher
│   ├── AESEncryption.java       # Implements AES encryption using Java Cryptography
│   ├── EncryptionTool.java      # Main CLI program to select and use encryption methods
├── README.md                    # Project documentation
├── .gitignore                    # Excludes unnecessary files from Git tracking
├── bin/                          # Executable files (ignored in Git)
├── EncryptionTool.iml            # IntelliJ project file (optional)

```

## Installation & Setup
### Prerequisites
Ensure you have the following installed:
- **Java JDK 8+** (for compilation and execution)
- A Java-compatible terminal or command prompt

### Steps to Run the Project
1. **Clone the repository**:
   ```sh
   git clone https://github.com/DeeshaP26/Encryption-Tool.git
   cd EncryptionTool
2. **Create bin directory**:
   ```sh
   mkdir bin
3. **Compile the Java files**:
   ```sh
   javac -d bin src/*.java
4. **Run the Encryption Tool**:
   ```sh
   java -cp bin EncryptionTool

## Contributing
Feel free to submit issues or contribute by creating pull requests. Any improvements or additional encryption methods are welcome!

## License
This project is licensed under the [MIT License](LICENSE). See the  file for details.
