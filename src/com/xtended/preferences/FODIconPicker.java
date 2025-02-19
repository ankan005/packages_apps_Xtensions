/*
 * Copyright (C) 2020 The Syberia Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xtended.preferences;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import com.android.settings.R;

import com.android.settingslib.Utils;
import com.android.settingslib.widget.LayoutPreference;

public class FODIconPicker extends LayoutPreference {

    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;

    private View mRootView;

    private static ImageButton Button0;
    private static ImageButton Button1;
    private static ImageButton Button2;
    private static ImageButton Button3;
    private static ImageButton Button4;
    private static ImageButton Button5;
    private static ImageButton Button6;
    private static ImageButton Button7;
    private static ImageButton Button8;
    private static ImageButton Button9;
    private static ImageButton Button10;
    private static ImageButton Button11;
    private static ImageButton Button12;
    private static ImageButton Button13;
    private static ImageButton Button14;
    private static ImageButton Button15;
    private static ImageButton Button16;
    private static ImageButton Button17;
    private static ImageButton Button18;
    private static ImageButton Button19;
    private static ImageButton Button20;
    private static ImageButton Button21;
    private static ImageButton Button22;
    private static ImageButton Button23;

    private static final String TAG = "FODIconPicker";

    public FODIconPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0 /* defStyleAttr */);
    }

    public FODIconPicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Preference);
        mAllowDividerAbove = TypedArrayUtils.getBoolean(a, R.styleable.Preference_allowDividerAbove,
                R.styleable.Preference_allowDividerAbove, false);
        mAllowDividerBelow = TypedArrayUtils.getBoolean(a, R.styleable.Preference_allowDividerBelow,
                R.styleable.Preference_allowDividerBelow, false);
        a.recycle();

        a = context.obtainStyledAttributes(
                attrs, R.styleable.Preference, defStyleAttr, 0);
        int layoutResource = a.getResourceId(R.styleable.Preference_android_layout, 0);
        if (layoutResource == 0) {
            throw new IllegalArgumentException("LayoutPreference requires a layout to be defined");
        }
        a.recycle();

        // Need to create view now so that findViewById can be called immediately.
        final View view = LayoutInflater.from(getContext())
                .inflate(layoutResource, null, false);
        setView(view, context);
    }

    private void setView(View view, Context context) {
        setLayoutResource(R.layout.layout_preference_frame);
        mRootView = view;
        setShouldDisableView(false);
        Button0 = findViewById(R.id.fodicon0_button);
        Button1 = findViewById(R.id.fodicon1_button);
        Button2 = findViewById(R.id.fodicon2_button);
        Button3 = findViewById(R.id.fodicon3_button);
        Button4 = findViewById(R.id.fodicon4_button);
        Button5 = findViewById(R.id.fodicon5_button);
        Button6 = findViewById(R.id.fodicon6_button);
        Button7 = findViewById(R.id.fodicon7_button);
        Button8 = findViewById(R.id.fodicon8_button);
        Button9 = findViewById(R.id.fodicon9_button);
        Button10 = findViewById(R.id.fodicon10_button);
        Button11 = findViewById(R.id.fodicon11_button);
        Button12 = findViewById(R.id.fodicon12_button);
        Button13 = findViewById(R.id.fodicon13_button);
        Button14 = findViewById(R.id.fodicon14_button);
        Button15 = findViewById(R.id.fodicon15_button);
        Button16 = findViewById(R.id.fodicon16_button);
        Button17 = findViewById(R.id.fodicon17_button);
        Button18 = findViewById(R.id.fodicon18_button);
        Button19 = findViewById(R.id.fodicon19_button);
        Button20 = findViewById(R.id.fodicon20_button);
        Button21 = findViewById(R.id.fodicon21_button);
        Button22 = findViewById(R.id.fodicon22_button);
        Button23 = findViewById(R.id.fodicon23_button);

        int defaultfodicon = Settings.System.getInt(
                context.getContentResolver(), Settings.System.FOD_ICON, 0);
        if (defaultfodicon==0) {
            updateHighlightedItem(Button0, context);
        } else if (defaultfodicon == 1) {
            updateHighlightedItem(Button1, context);
        } else if (defaultfodicon == 2) {
            updateHighlightedItem(Button2, context);
        } else if (defaultfodicon == 3) {
            updateHighlightedItem(Button3, context);
        } else if (defaultfodicon == 4) {
            updateHighlightedItem(Button4, context);
        } else if (defaultfodicon == 5) {
            updateHighlightedItem(Button5, context);
        } else if (defaultfodicon == 6) {
            updateHighlightedItem(Button6, context);
        } else if (defaultfodicon == 7) {
            updateHighlightedItem(Button7, context);
        } else if (defaultfodicon == 8) {
            updateHighlightedItem(Button8, context);
        } else if (defaultfodicon == 9) {
            updateHighlightedItem(Button9, context);
        } else if (defaultfodicon == 10) {
            updateHighlightedItem(Button10, context);
        } else if (defaultfodicon == 11) {
            updateHighlightedItem(Button11, context);
        } else if (defaultfodicon == 12) {
            updateHighlightedItem(Button12, context);
        } else if (defaultfodicon == 13) {
            updateHighlightedItem(Button13, context);
        } else if (defaultfodicon == 14) {
            updateHighlightedItem(Button14, context);
        } else if (defaultfodicon == 15) {
            updateHighlightedItem(Button15, context);
        } else if (defaultfodicon == 16) {
            updateHighlightedItem(Button16, context);
        } else if (defaultfodicon == 17) {
            updateHighlightedItem(Button17, context);
        } else if (defaultfodicon == 18) {
            updateHighlightedItem(Button18, context);
        } else if (defaultfodicon == 19) {
            updateHighlightedItem(Button19, context);
        } else if (defaultfodicon == 20) {
            updateHighlightedItem(Button20, context);
        } else if (defaultfodicon == 21) {
            updateHighlightedItem(Button21, context);
        } else if (defaultfodicon == 22) {
            updateHighlightedItem(Button22, context);
        } else if (defaultfodicon == 23) {
            updateHighlightedItem(Button23, context);
        }

        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(0, context);
                updateHighlightedItem(Button0, context);
            }
        });
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(1, context);
                updateHighlightedItem(Button1, context);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(2, context);
                updateHighlightedItem(Button2, context);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(3, context);
                updateHighlightedItem(Button3, context);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(4, context);
                updateHighlightedItem(Button4, context);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(5, context);
                updateHighlightedItem(Button5, context);
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(6, context);
                updateHighlightedItem(Button6, context);
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(7, context);
                updateHighlightedItem(Button7, context);
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(8, context);
                updateHighlightedItem(Button8, context);
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(9, context);
                updateHighlightedItem(Button9, context);
            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(10, context);
                updateHighlightedItem(Button10, context);
            }
        });
        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(11, context);
                updateHighlightedItem(Button11, context);
            }
        });
        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(12, context);
                updateHighlightedItem(Button12, context);
            }
        });
        Button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(13, context);
                updateHighlightedItem(Button13, context);
            }
        });
        Button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(14, context);
                updateHighlightedItem(Button14, context);
            }
        });
        Button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(15, context);
                updateHighlightedItem(Button15, context);
            }
        });
        Button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(16, context);
                updateHighlightedItem(Button16, context);
            }
        });
        Button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(17, context);
                updateHighlightedItem(Button17, context);
            }
        });
        Button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(18, context);
                updateHighlightedItem(Button18, context);
            }
        });
        Button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(19, context);
                updateHighlightedItem(Button19, context);
            }
        });
        Button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(20, context);
                updateHighlightedItem(Button20, context);
            }
        });
        Button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(21, context);
                updateHighlightedItem(Button21, context);
            }
        });
        Button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(22, context);
                updateHighlightedItem(Button22, context);
            }
        });
        Button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(23, context);
                updateHighlightedItem(Button23, context);
            }
        });
    }

    private void updateSettings(int fodicon, Context context) {
        Settings.System.putInt(context.getContentResolver(), Settings.System.FOD_ICON, fodicon);
    }

    private void updateHighlightedItem(ImageButton activebutton, Context context) {
        int defaultcolor = context.getResources().getColor(R.color.fod_item_background_stroke_color);
        ColorStateList defaulttint = ColorStateList.valueOf(defaultcolor);
        Button0.setBackgroundTintList(defaulttint);
        Button1.setBackgroundTintList(defaulttint);
        Button2.setBackgroundTintList(defaulttint);
        Button3.setBackgroundTintList(defaulttint);
        Button4.setBackgroundTintList(defaulttint);
        Button5.setBackgroundTintList(defaulttint);
        Button6.setBackgroundTintList(defaulttint);
        Button7.setBackgroundTintList(defaulttint);
        Button8.setBackgroundTintList(defaulttint);
        Button9.setBackgroundTintList(defaulttint);
        Button10.setBackgroundTintList(defaulttint);
        Button11.setBackgroundTintList(defaulttint);
        Button12.setBackgroundTintList(defaulttint);
        Button13.setBackgroundTintList(defaulttint);
        Button14.setBackgroundTintList(defaulttint);
        Button15.setBackgroundTintList(defaulttint);
        Button16.setBackgroundTintList(defaulttint);
        Button17.setBackgroundTintList(defaulttint);
        Button18.setBackgroundTintList(defaulttint);
        Button19.setBackgroundTintList(defaulttint);
        Button20.setBackgroundTintList(defaulttint);
        Button21.setBackgroundTintList(defaulttint);
        Button22.setBackgroundTintList(defaulttint);
        Button23.setBackgroundTintList(defaulttint);
        activebutton.setBackgroundTintList(Utils.getColorAttr(getContext(), android.R.attr.colorAccent));
    }
}
