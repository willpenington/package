package io.metaparticle.annotations;

public @interface PackageFile {
    String path();

    String src() default "";
}
