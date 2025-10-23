# RegexRealWorldExamples.java - Real-World Regular Expression Applications

## Overview
This file demonstrates practical regex applications focusing on phone number masking and formatting, and credit card validation and masking. These examples show real-world data protection scenarios that developers encounter in production applications for securing sensitive personal and financial information.

## Prompts for Replication

### Prompt 1: Phone Number Masking with Regex
**Task**: Create a method that demonstrates phone number masking and formatting techniques using regex patterns and capturing groups for privacy protection.

**Expected Function Signature**: `private static void maskPhoneNumbers()`

**Requirements**:
- Print section header: "1. Phone Number Masking with Regex:"
- Use text: `"My phone numbers are 123-456-7890 and 987-654-3210"`
- Replace all phone numbers with `"***-***-****"` using `replaceAll()` for privacy masking
- Reformat phone numbers to `(123) 456-7890` format using capturing groups
- Clean up extra whitespace from: `"This   has    too     many      spaces"`
- Use pattern `\\s+` to replace multiple spaces with single space
- Show before and after results for each transformation with clear labels

---

### Prompt 2: Credit Card Validation and Masking
**Task**: Create a method that validates credit card numbers and demonstrates secure masking techniques for financial data protection in compliance with security standards.

**Expected Function Signature**: `private static void creditCardValidation()`

**Requirements**:
- Print section header: "2. Credit Card Validation and Masking:"
- Create test array with various credit card formats:
  - Valid Visa: "4123456789012345", "4123 4567 8901 2345", "4123-4567-8901-2345"
  - Valid Mastercard: "5123456789012345", "5123 4567 8901 2345"
  - Invalid cards: wrong prefix, wrong length, contains letters
- Implement Visa validation: `"^4\\d{3}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$"`
- Implement Mastercard validation: `"^5[1-5]\\d{2}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$"`
- Display validation results showing card type (Visa/Mastercard/Invalid)
- Demonstrate two masking techniques:
  - Full masking: show only last 4 digits ("****-****-****-1234")
  - Partial masking: show first 4 and last 4 digits ("4123-****-****-2345")
- Process sample texts containing embedded credit card numbers

## Key Concepts Covered

### 1. Phone Number Privacy and Security

**What you'll learn:**
- Phone number masking for privacy protection in logs and displays
- Reformatting phone numbers using capturing groups
- Text normalization and whitespace cleanup
- Privacy compliance through data masking

**Code Examples:**
```java
String phoneText = "My phone numbers are 123-456-7890 and 987-654-3210";

// Privacy masking - hide phone numbers completely
String hiddenPhones = phoneText.replaceAll("\\d{3}-\\d{3}-\\d{4}", "***-***-****");
// Result: "My phone numbers are ***-***-**** and ***-***-****"

// Phone number reformatting with capturing groups
String formattedPhones = phoneText.replaceAll("(\\d{3})-(\\d{3})-(\\d{4})", "($1) $2-$3");
// Result: "My phone numbers are (123) 456-7890 and (987) 654-3210"

// Text cleaning - normalize whitespace for data consistency
String messyText = "This   has    too     many      spaces";
String cleanText = messyText.replaceAll("\\s+", " ");
// Result: "This has too many spaces"
```

**Key Points:**
- **Privacy protection** through complete phone number masking
- **Capturing groups** `(\\d{3})` enable flexible reformatting
- **Backreferences** `$1`, `$2`, `$3` reorganize captured phone parts
- **Whitespace normalization** `\\s+` handles multiple space types
- **Data consistency** through standardized formatting

**Phone Number Pattern Breakdown:**
- **Basic pattern**: `\\d{3}-\\d{3}-\\d{4}` matches standard XXX-XXX-XXXX format
- **Capturing pattern**: `(\\d{3})-(\\d{3})-(\\d{4})` creates three groups for area code, exchange, and number
- **Flexible separators**: Can be extended to `\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}` for various formats

### 2. Credit Card Security and Validation

**What you'll learn:**
- Industry-standard credit card validation patterns
- Different card type identification using regex
- Financial data security through multiple masking strategies
- PCI DSS compliance considerations for card data handling

**Code Examples:**
```java
// Visa validation pattern (starts with 4, 16 digits)
String visaPattern = "^4\\d{3}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$";
Pattern visaCompiled = Pattern.compile(visaPattern);

// Mastercard validation pattern (starts with 5[1-5], 16 digits)
String mastercardPattern = "^5[1-5]\\d{2}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$";
Pattern mastercardCompiled = Pattern.compile(mastercardPattern);

// Card type detection
String card = "4123 4567 8901 2345";
if (visaCompiled.matcher(card).matches()) {
    System.out.println("Visa card detected");
} else if (mastercardCompiled.matcher(card).matches()) {
    System.out.println("Mastercard detected");
}

// Security masking - show only last 4 digits (PCI DSS compliant)
String text = "Payment with card 4123456789012345";
String masked = text.replaceAll("\\b(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})\\b", 
                               "****-****-****-$4");
// Result: "Payment with card ****-****-****-2345"

// Partial masking - show first 4 and last 4 digits (for payment processing)
String partialMask = text.replaceAll("\\b(\\d{4})[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?(\\d{4})\\b", 
                                   "$1-****-****-$2");
// Result: "Payment with card 4123-****-****-2345"
```

**Key Points:**
- **Card-specific patterns** use different starting digit requirements
- **Flexible separators** `[\\s-]?` handle spaces, dashes, or no separators
- **Anchoring** `^` and `$` ensure full number validation
- **Security masking** protects sensitive financial data in compliance with PCI DSS
- **Multiple masking levels** for different security requirements and use cases

**Credit Card Pattern Breakdown:**
- **Visa**: `^4\\d{3}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$`
  - `^4` - Must start with 4
  - `\\d{3}` - Followed by exactly 3 digits
  - `[\\s-]?` - Optional space or dash separator
  - Repeated pattern for 4 groups of 4 digits
- **Mastercard**: `^5[1-5]\\d{2}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$`
  - `^5[1-5]` - Must start with 51-55 (Mastercard range)
  - Similar structure for remaining digits

## Real-World Security Applications

### Data Masking for Privacy Compliance
```java
// Phone number privacy masking for GDPR compliance
public String maskPersonalData(String customerData) {
    // Mask phone numbers
    String masked = customerData.replaceAll("\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b", "***-***-****");
    
    // Mask email addresses (keep domain for analytics)
    masked = masked.replaceAll("\\b[\\w._%+-]+(@[\\w.-]+\\.[A-Za-z]{2,})\\b", "****$1");
    
    return masked;
}

// Credit card masking for PCI DSS compliance
public String sanitizePaymentLogs(String logEntry) {
    // Mask all credit card numbers
    return logEntry.replaceAll("\\b\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}\\b", 
                              "****-****-****-XXXX");
}
```

### Payment Processing Security
```java
public class SecurePaymentProcessor {
    private static final Pattern VISA_PATTERN = Pattern.compile("^4\\d{15}$");
    private static final Pattern MASTERCARD_PATTERN = Pattern.compile("^5[1-5]\\d{14}$");
    
    public PaymentResult processPayment(String cardNumber, String amount) {
        // Step 1: Clean input (remove separators)
        String cleanCard = cardNumber.replaceAll("[\\s-]", "");
        
        // Step 2: Validate card type
        String cardType = getCardType(cleanCard);
        if ("Invalid".equals(cardType)) {
            return PaymentResult.invalid("Invalid card format");
        }
        
        // Step 3: Process payment with masked logging
        String maskedCard = maskCardNumber(cardNumber);
        logPaymentAttempt(maskedCard, amount);
        
        return PaymentResult.success(cardType, maskedCard);
    }
    
    private String getCardType(String cleanCard) {
        if (VISA_PATTERN.matcher(cleanCard).matches()) {
            return "Visa";
        } else if (MASTERCARD_PATTERN.matcher(cleanCard).matches()) {
            return "Mastercard";
        } else {
            return "Invalid";
        }
    }
    
    private String maskCardNumber(String cardNumber) {
        return cardNumber.replaceAll("\\b(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})\\b", 
                                   "****-****-****-$4");
    }
}
```

### Customer Service Applications
```java
public class CustomerServiceTools {
    
    // Mask customer data for screen sharing during support calls
    public String prepareForScreenShare(String customerInfo) {
        String masked = customerInfo;
        
        // Mask phone numbers
        masked = masked.replaceAll("\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b", "***-***-****");
        
        // Mask credit cards
        masked = masked.replaceAll("\\b(\\d{4})[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?(\\d{4})\\b", 
                                 "$1-****-****-$2");
        
        // Mask SSN
        masked = masked.replaceAll("\\b\\d{3}-\\d{2}-(\\d{4})\\b", "***-**-$1");
        
        return masked;
    }
    
    // Format phone numbers consistently for database storage
    public String normalizePhoneNumber(String phone) {
        // Extract digits and reformat
        String digitsOnly = phone.replaceAll("[^\\d]", "");
        
        if (digitsOnly.length() == 10) {
            return digitsOnly.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");
        } else if (digitsOnly.length() == 11 && digitsOnly.startsWith("1")) {
            return digitsOnly.replaceAll("1(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");
        } else {
            return phone; // Return original if format not recognized
        }
    }
}
```

## Industry Standards and Compliance

### Credit Card Industry Standards
| Card Type | Pattern | Length | Starts With |
|-----------|---------|--------|-------------|
| **Visa** | `^4\\d{15}$` | 16 digits | 4 |
| **Mastercard** | `^5[1-5]\\d{14}$` | 16 digits | 51-55 |
| **American Express** | `^3[47]\\d{13}$` | 15 digits | 34, 37 |
| **Discover** | `^6(?:011\\|5\\d{2})\\d{12}$` | 16 digits | 6011, 65 |

### PCI DSS Compliance Requirements
1. **Never store complete card numbers** in logs or databases
2. **Mask in all displays** except secure payment forms
3. **Audit all access** to card data with masked logging
4. **Encrypt sensitive data** in transit and at rest
5. **Implement access controls** limiting who can see unmasked data

### Privacy Regulation Compliance (GDPR, CCPA)
```java
// GDPR-compliant phone number handling
public String anonymizeForAnalytics(String customerData) {
    // Replace with consistent anonymous identifiers
    return customerData.replaceAll("\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b", "[PHONE_ID]");
}

// CCPA-compliant data masking
public String maskForThirdPartySharing(String data) {
    // Mask all personally identifiable information
    String masked = data;
    masked = masked.replaceAll("\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b", "***-***-****");  // Phone
    masked = masked.replaceAll("\\b[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}\\b", "***@***.***");   // Email
    return masked;
}
```

## Performance Optimization for Production

### Pre-compiled Patterns
```java
public class OptimizedDataMasking {
    // Compile patterns once for better performance
    private static final Pattern PHONE_PATTERN = Pattern.compile("\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b");
    private static final Pattern CARD_PATTERN = Pattern.compile("\\b(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})\\b");
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    
    public String maskSensitiveData(String input) {
        String result = input;
        result = PHONE_PATTERN.matcher(result).replaceAll("***-***-****");
        result = CARD_PATTERN.matcher(result).replaceAll("****-****-****-$4");
        result = WHITESPACE_PATTERN.matcher(result).replaceAll(" ");
        return result.trim();
    }
}
```

### Batch Processing for Large Datasets
```java
// Process large files efficiently
public void maskSensitiveDataInFile(Path inputFile, Path outputFile) throws IOException {
    try (BufferedReader reader = Files.newBufferedReader(inputFile);
         BufferedWriter writer = Files.newBufferedWriter(outputFile)) {
        
        String line;
        while ((line = reader.readLine()) != null) {
            String maskedLine = maskSensitiveData(line);
            writer.write(maskedLine);
            writer.newLine();
        }
    }
}
```

## Testing and Validation Strategies

### Comprehensive Test Cases
```java
// Test phone number masking with various formats
String[] phoneTests = {
    "Call me at 123-456-7890",           // Standard format
    "Phone: (555) 123-4567",             // Parentheses format
    "Contact: 555.123.4567",             // Dot format
    "Mobile 5551234567",                 // No separators
    "Text with 123-456-7890 and 987-654-3210",  // Multiple phones
    "No phone numbers here"              // No matches
};

// Test credit card validation edge cases
String[] cardTests = {
    "4123456789012345",                  // Valid Visa
    "5123456789012345",                  // Valid Mastercard
    "4123456789012344",                  // Invalid Visa (wrong check digit)
    "4123-4567-8901-2345",              // Valid Visa with dashes
    "412345678901234",                   // Too short
    "41234567890123456",                 // Too long
    "3123456789012345",                  // Wrong starting digit
    "4123-4567-8901-234a"               // Contains letter
};
```

### Security Validation
```java
// Verify masking effectiveness
public void validateMasking(String originalData, String maskedData) {
    // Ensure no sensitive data remains
    if (maskedData.matches(".*\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b.*")) {
        throw new SecurityException("Phone number not properly masked");
    }
    
    if (maskedData.matches(".*\\b\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}\\b.*")) {
        throw new SecurityException("Credit card not properly masked");
    }
    
    System.out.println("✓ Data successfully masked for security");
}
```

## Real-World Integration Examples

### Web Application Security
```java
@RestController
public class CustomerController {
    
    @GetMapping("/customer/{id}")
    public CustomerResponse getCustomer(@PathVariable String id) {
        Customer customer = customerService.findById(id);
        
        // Mask sensitive data before returning to client
        customer.setPhone(maskPhoneNumber(customer.getPhone()));
        customer.setPaymentMethod(maskCardNumber(customer.getPaymentMethod()));
        
        return new CustomerResponse(customer);
    }
    
    private String maskPhoneNumber(String phone) {
        return phone.replaceAll("\\b(\\d{3})[-.\\s]?(\\d{3})[-.\\s]?(\\d{4})\\b", "***-***-$3");
    }
}
```

### Database Logging
```java
public class AuditLogger {
    
    public void logCustomerAccess(String userId, String customerData) {
        String maskedData = customerData
            .replaceAll("\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b", "***-***-****")
            .replaceAll("\\b(\\d{4})[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?(\\d{4})\\b", "****-****-****-$2");
        
        auditRepository.save(new AuditEntry(userId, "CUSTOMER_ACCESS", maskedData));
    }
}
```

### Data Export Sanitization
```java
public class DataExporter {
    
    public void exportCustomerData(List<Customer> customers, Path exportFile) throws IOException {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(exportFile))) {
            writer.println("ID,Name,Phone,Email,PaymentMethod");
            
            for (Customer customer : customers) {
                String maskedPhone = customer.getPhone().replaceAll("\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b", 
                                                                   "***-***-****");
                String maskedEmail = customer.getEmail().replaceAll("([^@]+)@", "***@");
                String maskedCard = customer.getPaymentMethod().replaceAll("\\b(\\d{4})[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?(\\d{4})\\b", 
                                                                          "****-****-****-$2");
                
                writer.printf("%s,%s,%s,%s,%s%n", 
                    customer.getId(), customer.getName(), maskedPhone, maskedEmail, maskedCard);
            }
        }
    }
}
```

## Common Security Pitfalls and Solutions

### 1. Incomplete Masking
```java
// ❌ Problematic - doesn't handle all phone formats
String inadequate = text.replaceAll("\\d{3}-\\d{3}-\\d{4}", "***-***-****");

// ✅ Better - handles multiple formats
String comprehensive = text.replaceAll("\\b\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}\\b", "***-***-****");
```

### 2. Format Variations
```java
// ❌ Problematic - only handles one card format
String limited = text.replaceAll("\\d{16}", "****************");

// ✅ Better - handles spaces and dashes
String flexible = text.replaceAll("\\b(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})\\b", 
                                "****-****-****-$4");
```

### 3. Test Data Security
```java
// Even test data should be masked in production logs
public class TestDataSecurity {
    private static final String[] TEST_CARDS = {
        "4000000000000002",  // Test Visa
        "5555555555554444"   // Test Mastercard
    };
    
    public void logTestResult(String testCard, boolean result) {
        String masked = maskCardNumber(testCard);
        logger.info("Test card {} validation result: {}", masked, result);
    }
}
```

## Best Practices Summary

### Security Guidelines
1. **Mask immediately**: Never log unmasked sensitive data
2. **Use appropriate masking level**: Full mask for logs, partial for user identification
3. **Validate before processing**: Always check format before business logic
4. **Audit access**: Log all access to sensitive data with masking
5. **Regular security reviews**: Periodically review masking effectiveness

### Performance Guidelines
1. **Pre-compile patterns**: Store as static final variables for reuse
2. **Batch processing**: Process multiple items with same pattern
3. **Memory efficiency**: Use StringBuilder for large text processing
4. **Stream processing**: Handle large datasets without loading into memory

### Development Guidelines
1. **Security by design**: Include masking from the beginning
2. **Consistent formatting**: Standardize masked output format
3. **Error handling**: Gracefully handle malformed input
4. **Documentation**: Clearly document masking rules and compliance requirements
