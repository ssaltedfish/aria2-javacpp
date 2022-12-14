// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package io.github.ssaltedfish.aria2.cpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static io.github.ssaltedfish.aria2.global.Aria2.*;


/**
 * \struct
 *
 * This object identifies aria2 session. To create session, use
 * :func:{@code sessionNew()} function.
 */
@Namespace("aria2") @Opaque @Properties(inherit = io.github.ssaltedfish.aria2.prest.Aria2.class)
public class Session extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Session() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Session(Pointer p) { super(p); }
}
