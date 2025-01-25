# Android-DI-Hilt-Demo
這是一個展示如何在 Android 開發中使用 Hilt 進行依賴注入的範例專案。本專案採用現代 Android 開發技術和最佳實踐，展示了一個簡單的用戶管理應用。

## UI 畫面
![](./img/Screenshot.png)

## 技術架構
- **開發語言**: Kotlin
- **UI 框架**: Jetpack Compose
- **依賴注入**: Hilt
- **資料庫**: Room
- **架構模式**: MVVM
- **非同步處理**: Kotlin Coroutines & Flow
- **UI 設計**: Material Design 3

## 主要功能
- 使用者資料的新增和顯示
- 使用 Room 資料庫進行本地資料存儲
- 使用 Hilt 進行依賴注入
- 響應式 UI 更新

## 專案結構
```
app/src/main/java/com/hkt/hiltdemo/
├── HiltDemoApplication.kt          # 應用程式入口點
├── MainActivity.kt                 # 主活動
├── data/                          # 資料層
│   ├── AppDatabase.kt             # Room 資料庫設定
│   ├── User.kt                    # 使用者資料模型
│   ├── UserDao.kt                 # 資料庫訪問介面
│   └── UserRepository.kt          # 資料存取倉庫
├── di/                            # 依賴注入
│   └── DatabaseModule.kt          # 資料庫相關依賴配置
└── ui/                            # UI 層
    ├── UserScreen.kt              # 使用者介面
    └── UserViewModel.kt           # 視圖模型
```

## 技術特點
1. **Hilt 依賴注入**
   - 使用 `@HiltAndroidApp` 初始化應用程式
   - 通過 `@AndroidEntryPoint` 注入 Activity
   - 使用 `@HiltViewModel` 注入 ViewModel

2. **Room 資料庫**
   - 使用 Entity 定義資料表
   - 使用 DAO 進行資料操作
   - 透過 Flow 實現響應式資料更新

3. **Jetpack Compose UI**
   - 使用 Material Design 3 元件
   - 實現響應式 UI 更新
   - 支援深色主題

## 如何運行
1. Clone 專案到本地
2. 使用 Android Studio Hedgehog 或更新版本開啟專案
3. 等待 Gradle 同步完成
4. 點擊 Run 按鈕執行專案

## 系統需求
- Android Studio Hedgehog 或更新版本
- Kotlin 1.9.0 或更新版本
- Android SDK 34
- Gradle 8.2 或更新版本

## 學習重點
1. Hilt 依賴注入的基本使用
2. Room 資料庫的實現
3. MVVM 架構的應用
4. Jetpack Compose UI 的開發
5. Kotlin Coroutines 和 Flow 的使用