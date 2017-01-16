/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.android.quickfixes;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/android/quickfix")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidQuickFixMultiFileTestGenerated extends AbstractAndroidQuickFixMultiFileTest {
    public void testAllFilesPresentInQuickfix() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
    }

    @TestMetadata("idea/testData/android/quickfix/autoImports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class AutoImports extends AbstractAndroidQuickFixMultiFileTest {
        public void testAllFilesPresentInAutoImports() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix/autoImports"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("androidRImport.before.Main.kt")
        public void testAndroidRImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/android/quickfix/autoImports/androidRImport.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("idea/testData/android/quickfix/viewConstructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ViewConstructor extends AbstractAndroidQuickFixMultiFileTest {
        public void testAllFilesPresentInViewConstructor() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix/viewConstructor"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("indirect.before.Main.kt")
        public void testIndirect() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/android/quickfix/viewConstructor/indirect.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/android/quickfix/viewConstructor/simple.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }
}
