# Liquid Glass Integration for LeviLaunchroidUnlocked

This folder contains the modified files to add liquid glass effects to the LeviLaunchroidUnlocked project using the Liquid Glass library.

## Files Changed

### Project Structure Files
- `settings.gradle` - Added liquidglass module to the project
- `app/build.gradle` - Added liquidglass module dependency
- `liquidglass/build.gradle.kts` - Updated build configuration for the liquidglass library

### Layout Files
- `activity_main.xml` - Applied liquid glass effects to main UI cards:
  - Main card (top section with launch button)
  - Mods section card
  - Content management section card
  - Miscellaneous section card

- `nav_bar.xml` - Navigation bar (can optionally apply liquid glass here too)

### Java Files
- `MainActivity.java` - Updated to support liquid glass view references

### Library Module
- `liquidglass/` - Complete liquidglass library module copied from the reference implementation

## Installation Instructions

1. **Copy the liquidglass module** to your project root:
   ```bash
   cp -r liquidglass/ /path/to/your/LeviLaunchroidUnlocked/
   ```

2. **Update settings.gradle**:
   - Replace your existing `settings.gradle` with the one in this folder
   - Or manually add: `include ':liquidglass'`

3. **Update app/build.gradle**:
   - Replace your existing `app/build.gradle` with the one in this folder
   - Or manually add: `implementation project(':liquidglass')`

4. **Update layout files**:
   - Replace `activity_main.xml` with the one in this folder
   - Optionally replace `nav_bar.xml` for navigation bar effects

5. **Update MainActivity.java**:
   - The changes in MainActivity.java are minimal and mainly for compatibility
   - You can merge the changes if needed

## Liquid Glass Effects Applied

The following liquid glass parameters are used:
- `cornerRadius="16dp"` - Rounded corners for cards
- `glassTint="#20FFFFFF"` - Light white tint (12% opacity)
- `glassTintStrength="0.2"` - Glass tint strength
- `blurAmount="0.0625"` - Background blur amount
- `displacementScale="70"` - Edge distortion scale
- `saturation="140"` - Color saturation enhancement
- `aberrationIntensity="2"` - Chromatic aberration intensity
- `elasticity="0.15"` - Touch elasticity for press effects

## Customization

You can customize the liquid glass effects by modifying the XML attributes in the layout files:

- Change `glassTint` to use different colors (e.g., `#4C0A84FF` for blue)
- Adjust `glassTintStrength` for more/less opacity
- Modify `blurAmount` for different blur levels
- Change `cornerRadius` for different border radius

## Notes

- The liquid glass library requires API 24+ (Android 7.0+)
- The project is configured for API 36 compile SDK
- The effects work best on devices with good GPU performance
- Some advanced features like runtime shaders require API 33+

## Original Reference

The liquid glass library is based on:
- https://github.com/QWEA0/Liquid-Glass-Android
- https://github.com/Kyant0/AndroidLiquidGlass

## Troubleshooting

If you encounter build issues:
1. Ensure Java 21 is installed and JAVA_HOME is set
2. Run `./gradlew clean` before building
3. Check that the liquidglass module is properly included in settings.gradle
4. Verify that the NDK version matches between modules

## License

The liquid glass library has its own license. Please review it in the liquidglass folder before distribution.