package io.muehlbachler.bswe;

import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Service for string operations.
 */
@Service
public class StringService {
    
    /**
     * Converts a string to upper case.
     * If the given string is null or empty, null or empty will returned.
     * 
     * @param string the string to convert
     * @return the modified string in upper case
     */
    public String toUpperCase(final String string) {
        return string == null ? null : string.toUpperCase(Locale.getDefault());
    }
}
