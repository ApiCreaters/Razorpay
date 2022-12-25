#ApiCreaters
Custom Toast Create

To get a Git project into your build:
> Step 1. Add the JitPack repository to your build file

'''gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}'''
  
  
> Step 2. Add the dependency
  '''gradle
  dependencies {
	        implementation 'com.github.ApiCreaters:Razorpay:Tag'
}'''
  
  That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).

If the project doesn't have any GitHub Releases you can use the short commit hash or 'master-SNAPSHOT' as the version.
https://jitpack.io/#Ap@iCr!eaters/Razorpay/1.0.1
s
